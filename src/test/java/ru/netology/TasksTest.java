package ru.netology;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class TasksTest {
    @Test
    public void shouldRunQueryOfDifferentTasks() {
       simpleTask simpleTask = new simpleTask(5, "Позвонить родителям");

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        Task task = new Task(55);
        String query = "Позвонить";

        task.matches(String.valueOf(simpleTask));
        task.matches(String.valueOf(epic));
        task.matches(String.valueOf(meeting));

        Task[] expected = {simpleTask, epic, meeting};
        Task[] actual;
        actual = task.matches(String query);
        Assertions.assertArrayEquals(expected, actual);
    }
}
