package models.project;

public class Client
{
    private String contactMail;
    private Project project;
    private String name;
    private String company;

    public Client(String contactMail, Project project, String name, String company)
    {
        this.contactMail = contactMail;
        this.project = project;
        this.name = name;
        this.company = company;
    }

    public String getContactMail()
    {
        return contactMail;
    }

    public void setContactMail(String contactMail)
    {
        this.contactMail = contactMail;
    }

    public Project getProject()
    {
        return project;
    }

    public void setProject(Project project)
    {
        this.project = project;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getCompany()
    {
        return company;
    }

    public void setCompany(String company)
    {
        this.company = company;
    }
}
