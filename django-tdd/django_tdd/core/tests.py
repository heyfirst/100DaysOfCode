from django.test import TestCase
from core.models import Todo


# Create your tests here.
class ModelTests(TestCase):
    def test_should_be_return_todos_when_get_all_todos(self):
        Todo.objects.create(task="todo1", status=False)
        todos = Todo.objects.all()

        self.assertTrue(todos.exists())

    def test_should_be_return_todo_when_one_todos(self):
        Todo.objects.create(task="todo1", status=False)
        todos = Todo.objects.get(task="todo1")

        self.assertTrue(todos is not None)


class TodoTests(TestCase):
    def test_homepage(self):
        response = self.client.get('/')
        self.assertEqual(response.status_code, 200)
