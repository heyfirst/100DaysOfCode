package helloworld

import (
	"net/http"

	"github.com/labstack/echo"
)

// API is HelloWorld API
type API struct {
	Service *Service
}

// GetAllHelloWorldHandler is x
func (api API) GetAllHelloWorldHandler(c echo.Context) error {
	helloworlds, err := api.Service.ListHelloWorld()
	if err != nil {
		return c.JSON(http.StatusInternalServerError, err.Error())
	}
	return c.JSON(http.StatusOK, helloworlds)
}
