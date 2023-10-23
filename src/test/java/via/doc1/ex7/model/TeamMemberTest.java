package via.doc1.ex7.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TeamMemberTest {
    private TeamMember teamMember;
    private List<Task> tasks;

    @BeforeEach
    public void setUp() {
        tasks = new ArrayList<>();
        tasks.add(new Task("1", "Task1", "Description1"));
        tasks.add(new Task("2", "Task2", "Description2"));

        teamMember = new TeamMember("1", "John Doe", "john@example.com", tasks);
    }

    @Test
    public void testConstructor() {
        assertEquals("1", teamMember.getId());
        assertEquals("John Doe", teamMember.getName());
        assertEquals("john@example.com", teamMember.getEmail());
        assertEquals(tasks, teamMember.getTasks());
    }

    @Test
    public void testSetters() {
        teamMember.setId("2");
        teamMember.setName("Jane Doe");
        teamMember.setEmail("jane@example.com");

        assertEquals("2", teamMember.getId());
        assertEquals("Jane Doe", teamMember.getName());
        assertEquals("jane@example.com", teamMember.getEmail());
    }

    @Test
    public void testToString() {
        String expectedToString = "TeamMember{id='1', name='John Doe', email='john@example.com'}";
        assertEquals(expectedToString, teamMember.toString());
    }

    @Test
    public void testGetTasks() {
        assertEquals(tasks, teamMember.getTasks());
    }

    @Test
    public void testSetTasks() {
        List<Task> newTasks = new ArrayList<>();
        newTasks.add(new Task("3", "Task3", "Description3"));
        newTasks.add(new Task("4", "Task4", "Description4"));

        teamMember.setTasks(newTasks);

        assertEquals(newTasks, teamMember.getTasks());
    }




}