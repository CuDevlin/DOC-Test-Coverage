package via.doc1.ex7.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TeamMemberTest {
    @Test
    public void ctor_normaluse_noerrors()
    {
        //Arrange
        String memberId = "Member1";
        String memberName = "Steve";
        String memberEmail = "steve@gmail.com";
        String taskId = "Task1";
        String taskName = "Tough task";
        String taskDesc = "Cleanup the mess";

        //Act
        Task testTask = new Task(taskId, taskName, taskDesc);
        List<Task> memberTasks = new ArrayList<>();
        memberTasks.add(testTask);
        TeamMember teamMember = new TeamMember(memberId, memberName, memberEmail, memberTasks);

        //Assert
        assertTrue(teamMember.getName().equals(memberName));
        assertTrue(teamMember.getId().equals(memberId));
        assertTrue(teamMember.getEmail().equals(memberEmail));
        assertTrue(teamMember.getTasks().equals(memberTasks));
    }

    @Test
    public void teamMember_testsetting_noerrors(){
        //Arrange
        String memberId = "Member1";
        String memberName = "Steve";
        String memberEmail = "steve@gmail.com";

        String taskId = "Task1";
        String taskName = "Tough task";
        String taskDesc = "Cleanup the mess";

        String newid = "Member2";
        String newName = "Sbeve";
        String newEmail = "Sbeve@gmail.com";

        //Act
        Task testTask = new Task(taskId, taskName, taskDesc);
        List<Task> memberTasks = new ArrayList<>();
        List<Task> newTasks = new ArrayList<>();
        newTasks.add(testTask);
        TeamMember teamMember = new TeamMember(memberId, memberName, memberEmail, memberTasks);

        teamMember.setId(newid);
        teamMember.setEmail(newEmail);
        teamMember.setName(newName);
        teamMember.setTasks(newTasks);

        //Assert
        assertTrue(teamMember.getName().equals(newName));
        assertTrue(teamMember.getId().equals(newid));
        assertTrue(teamMember.getEmail().equals(newEmail));
        assertTrue(teamMember.getTasks().equals(newTasks));
    }

    @Test
    public void teamMember_testtostring_noerrors(){
        //Arrange
        String memberId = "Member1";
        String memberName = "Steve";
        String memberEmail = "steve@gmail.com";
        String taskId = "Task1";
        String taskName = "Tough task";
        String taskDesc = "Cleanup the mess";

        //Act
        Task testTask = new Task(taskId, taskName, taskDesc);
        List<Task> memberTasks = new ArrayList<>();
        memberTasks.add(testTask);
        TeamMember teamMember = new TeamMember(memberId, memberName, memberEmail, memberTasks);
        String memberString = teamMember.toString();

        //Assert
        assertTrue(teamMember.toString().equals(memberString));
    }
}
