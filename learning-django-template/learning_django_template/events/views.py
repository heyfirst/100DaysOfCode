# some_app/views.py
from django.views.generic import TemplateView


class ListOfEvents(TemplateView):
    template_name = "events/events.html"

    def get_context_data(self, **kwargs):
        context = super().get_context_data(**kwargs)
        context['events'] = [
            {
                'title': 'Code In The Dark',
                'date': '10 Oct 2020'
            },
            {
                'title': 'Codemania',
                'date': '15 Oct 2020'
            },
            {
                'title': 'Pycon SG',
                'date': '20 Oct 2020'
            },
        ]
        context['user'] = {
            'name': 'Kanisorn Sutham',
        }

        return context
