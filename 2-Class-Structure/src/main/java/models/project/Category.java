package models.project;

import models.employees.Role;

public class Category
{
    private String name;
    private String description;
    private Role[] requiredRoles;

    public Category(String name, String description, Role[] requiredRoles)
    {
        this.name = name;
        this.description = description;
        this.requiredRoles = requiredRoles;
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

    public Role[] getRequiredRoles()
    {
        return requiredRoles;
    }

    public void setRequiredRoles(Role[] requiredRoles)
    {
        this.requiredRoles = requiredRoles;
    }
}
