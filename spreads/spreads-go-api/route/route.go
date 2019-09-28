package route

import (
	helloworld "spreads/helloworld"

	"github.com/labstack/echo"
)

// InitRoute for all application
func InitRoute(c echo.Group, helloWorldAPI helloworld.API) {
	c.GET("/helloworld", helloWorldAPI.GetAllHelloWorldHandler)
}
