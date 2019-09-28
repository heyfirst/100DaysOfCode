package main

import (
	"fmt"
	"net/http"

	"github.com/go-pg/pg/v9"
	"github.com/labstack/echo"
	"github.com/labstack/echo/middleware"

	configLibrary "spreads/config"
	helloworld "spreads/helloworld"
	route "spreads/route"
)

var config configLibrary.Config

func main() {
	config = configLibrary.SetupConfig()
	pgOptions, _ := pg.ParseURL(config.DatabaseURI)
	db := pg.Connect(pgOptions)

	defer db.Close()

	e := echo.New()

	e.Use(middleware.Recover())
	e.Use(middleware.Logger())
	e.Use(middleware.Gzip())
	e.Use(middleware.CORSWithConfig(middleware.CORSConfig{
		AllowOrigins: []string{"http://localhost:3000"},
		AllowHeaders: []string{echo.HeaderOrigin, echo.HeaderContentType, echo.HeaderAccept, "x-access-token"},
	}))

	e.GET("/healthcheck", getHealthCheck)

	routeGroup := e.Group("/v1")

	helloWorldRepository := helloworld.RepositoryPostgres{
		DBConnection: db,
	}

	helloworldService := helloworld.Service{
		Repository: &helloWorldRepository,
	}

	helloworldAPI := helloworld.API{
		Service: &helloworldService,
	}

	route.InitRoute(*routeGroup, helloworldAPI)

	fmt.Printf("Running!!!")
	e.Logger.Fatal(e.Start(":" + config.Port))
}

func getHealthCheck(c echo.Context) error {
	return c.JSON(http.StatusOK, config)
}
