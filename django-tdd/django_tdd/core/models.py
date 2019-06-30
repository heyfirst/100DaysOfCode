from django.db import models


# Create your models here.
class Todo(models.Model):
    task = models.TextField(max_length=255, default="")
    status = models.BooleanField(default=False)
