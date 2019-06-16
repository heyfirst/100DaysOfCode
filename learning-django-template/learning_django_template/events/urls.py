from django.urls import path

from . import views

urlpatterns = [
    path('events', views.ListOfEvents.as_view(), name="events"),
]
