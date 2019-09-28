package helloworld

import "time"

// HelloWorld model
type HelloWorld struct {
	ID        int       `json:"id"`
	HelloText string    `json:"hello_text"`
	CreatedAt time.Time `json:"created_at"`
}
