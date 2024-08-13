package models.status;

public class Status
{
    private String name;
    private String description;
    private String scope;

    public Status(String name, String description, String scope)
    {
        this.name = name;
        this.description = description;
        this.scope = scope;
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

    public String getScope()
    {
        return scope;
    }

    public void setScope(String scope)
    {
        this.scope = scope;
    }
}
