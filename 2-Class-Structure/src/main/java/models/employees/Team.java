package models.employees;

import models.project.Project;

public class Team
{
    private final int code;
    private boolean isOnProject;
    private Employee[] members;
    private Employee leader;
    private String name;
    private Project assignedProject;

    public Team(int code, boolean isOnProject, Employee[] members, Employee leader, String name)
    {
        this.code = code;
        this.isOnProject = isOnProject;
        this.members = members;
        this.leader = leader;
        this.name = name;
    }

    public int getCode()
    {
        return code;
    }

    public boolean isOnProject()
    {
        return isOnProject;
    }

    public void setOnProject(boolean onProject)
    {
        isOnProject = onProject;
    }

    public Employee[] getMembers()
    {
        return members;
    }

    public void setMembers(Employee[] members)
    {
        this.members = members;
    }

    public Employee getLeader()
    {
        return leader;
    }

    public void setLeader(Employee leader)
    {
        this.leader = leader;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Project getAssignedProject()
    {
        return assignedProject;
    }

    public void setAssignedProject(Project assignedProject)
    {
        this.assignedProject = assignedProject;
    }
}
