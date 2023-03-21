package ru.netology;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class TasksTest {
    @Test
    public void simpleTasksMatchesCorrectly() {
        Task task = new SimpleTask(5, "Позвонить родителям");
        Assertions.assertTrue(task.matches("Позвонить"));
        Assertions.assertFalse(task.matches("Прийти"));
    }

    @Test
    public void epicMatchesCorrectly() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Task task = new Epic(555, subtasks);
        Assertions.assertTrue(task.matches("Хлеб"));
        Assertions.assertFalse(task.matches("Сгущенка"));
    }

    @Test
    public void meetingMatchesCorrectly() {
        Task task = new Meeting(207, "Идентификация", "Шпионы", "23/03/2023");
        Assertions.assertTrue(task.matches("Шпионы"));
        Assertions.assertFalse(task.matches("Балерины"));
    }
}
