package helloworld

// Service type
type Service struct {
	Repository Repository
}

// ListHelloWorld represent list all hello world.
func (Service Service) ListHelloWorld() ([]HelloWorld, error) {
	return Service.Repository.GetAll()
}
