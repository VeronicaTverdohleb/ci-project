package via.doc1.ex7.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {

    private Task task;

    @BeforeEach
    public void setUp() {
        task = new Task("1", "TaskName", "TaskDescription");
    }

    @Test
    public void testConstructor() {
        assertEquals("1", task.getId());
        assertEquals("TaskName", task.getName());
        assertEquals("TaskDescription", task.getDescription());
    }

    @Test
    public void ctorTest()
    {
        String taskId = "Task1";
        String taskName = "Tough task";
        String taskDesc = "Cleanup the mess";
        Task testTask = new Task(taskId, taskName, taskDesc);
        assertTrue(testTask.getId().equals(taskId));
        assertTrue(testTask.getName().equals(taskName));
        assertTrue(testTask.getDescription().equals(taskDesc));
    }

    @Test
    public void testSetters() {
        task.setId("2");
        task.setName("NewName");
        task.setDescription("NewDescription");

        assertEquals("2", task.getId());
        assertEquals("NewName", task.getName());
        assertEquals("NewDescription", task.getDescription());
    }

    @Test
    public void testEquals() {
        Task equalTask = new Task("1", "TaskName", "TaskDescription");
        Task differentIdTask = new Task("2", "TaskName", "TaskDescription");
        //Task differentNameTask = new Task("1", "DifferentName", "TaskDescription");

        assertEquals(task, task);
        assertEquals(task, equalTask);
        assertNotEquals(task, differentIdTask);
       // assertNotEquals(task, differentNameTask);
        assertNotEquals(task, null);
        //assertNotEquals(task, "NotATaskObject");
    }
    @Test
    public void testHashCode() {
        Task equalTask = new Task("1", "TaskName", "TaskDescription");

        assertEquals(task.hashCode(), equalTask.hashCode());
    }
}
