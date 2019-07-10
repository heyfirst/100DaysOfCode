# some_app/views.py
from django.views.generic import TemplateView


class TodoListView(TemplateView):
    template_name = "todo/list.html"
