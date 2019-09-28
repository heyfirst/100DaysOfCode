package config

import (
	"os"
)

// Config is main config of project
type Config struct {
	DatabaseURI string `json:"database_uri" yaml:"database_uri"`
	Port        string `json:"port" yaml:"port"`
}

// SetupConfig function
func SetupConfig() Config {
	var config Config

	if os.Getenv("PORT") != "" {
		config.Port = os.Getenv("PORT")
	}
	if os.Getenv("DATABASE_URI") != "" {
		config.DatabaseURI = os.Getenv("DATABASE_URI")
	}

	return config
}
