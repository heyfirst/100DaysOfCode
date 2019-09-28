package helloworld

import (
	"github.com/go-pg/pg/v9"
)

// Repository repository
type Repository interface {
	GetAll() ([]HelloWorld, error)
}

// RepositoryPostgres connection
type RepositoryPostgres struct {
	DBConnection *pg.DB
}

// GetAll represent get all hello world data
func (db RepositoryPostgres) GetAll() ([]HelloWorld, error) {
	var hello []HelloWorld
	err := db.DBConnection.Model(&hello).Select()
	if err != nil {
		panic(err)
	}

	return hello, err
}
