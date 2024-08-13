package models.employees;

public class Role
{
    private double baseSalary;
    private String name;
    private String description;
    private Skills[] requiredSkills;

    public Role(double baseSalary, String name, String description, Skills[] requiredSkills)
    {
        this.baseSalary = baseSalary;
        this.name = name;
        this.description = description;
        this.requiredSkills = requiredSkills;
    }

    public double getBaseSalary()
    {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary)
    {
        this.baseSalary = baseSalary;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Skills[] getRequiredSkills()
    {
        return requiredSkills;
    }

    public void setRequiredSkills(Skills[] requiredSkills)
    {
        this.requiredSkills = requiredSkills;
    }
}
