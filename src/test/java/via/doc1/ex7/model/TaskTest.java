package via.doc1.ex7.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void ctor_normaluse_noerrors()
    {
        //Arrange
        String taskId = "Task1";
        String taskName = "Tough task";
        String taskDesc = "Cleanup the mess";
        //Act
        Task testTask = new Task(taskId, taskName, taskDesc);
        //Assert
        assertTrue(testTask.getId().equals(taskId));
        assertTrue(testTask.getName().equals(taskName));
        assertTrue(testTask.getDescription().equals(taskDesc));
    }

    @Test
    public void ctor_settingtask_noerrors()
    {
        //Arrange
        String taskId = "Task1";
        String taskName = "Tough task";
        String taskDesc = "Cleanup the mess";
        String newId = "Task2";
        String newName = "Easy Task";
        String newDesc = "Type more code";
        //Act
        Task testTask = new Task(taskId, taskName, taskDesc);
        testTask.setId(newId);
        testTask.setName(newName);
        testTask.setDescription(newDesc);
        //Assert
        assertTrue(testTask.getId().equals(newId));
        assertTrue(testTask.getName().equals(newName));
        assertTrue(testTask.getDescription().equals(newDesc));
    }

    @Test
    public void ctor_testequalstrue_noerrors()
    {
        //Arrange
        String taskId = "Task1";
        String taskName = "Tough task";
        String taskDesc = "Cleanup the mess";
        String newId = "Task1";
        String newName = "Tough task";
        String newDesc = "Cleanup the mess";
        //Act
        Task testTask = new Task(taskId, taskName, taskDesc);
        Object testTask2 = new Task(newId, newName, newDesc);
        //Assert
        assertTrue(testTask.equals(testTask2));
    }

    @Test
    public void ctor_gethashid_noerrors()
    {
        //Arrange
        String taskId = "Task1";
        String taskName = "Tough task";
        String taskDesc = "Cleanup the mess";
        //Act
        Task testTask = new Task(taskId, taskName, taskDesc);
        int hash = testTask.hashCode();
        //Assert
        assertTrue(testTask.hashCode() == hash);
    }
}
