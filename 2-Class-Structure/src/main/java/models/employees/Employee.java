package models.employees;

import java.util.Date;

public class Employee
{
    private String firstName;
    private String lastName;
    private Date hiringDate;
    private Role role;
    private Skills[] skills;
    private Hardware assignedHardware;

    public Hardware getAssignedHardware()
    {
        return assignedHardware;
    }

    public void setAssignedHardware(Hardware assignedHardware)
    {
        this.assignedHardware = assignedHardware;
    }

    public Skills[] getSkills()
    {
        return skills;
    }

    public void setSkills(Skills[] skills)
    {
        this.skills = skills;
    }

    public Role getRole()
    {
        return role;
    }

    public void setRole(Role role)
    {
        this.role = role;
    }

    public Date getHiringDate()
    {
        return hiringDate;
    }

    public void setHiringDate(Date hiringDate)
    {
        this.hiringDate = hiringDate;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public Employee(String firstName, String lastName, Date hiringDate, Role role, Skills[] skills)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hiringDate = hiringDate;
        this.role = role;
        this.skills = skills;
    }
}
