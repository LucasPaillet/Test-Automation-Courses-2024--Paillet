package models.project;

import models.status.Status;

import java.util.Date;

public class Project
{
    private int code;
    private Date deadLine;
    private String name;
    private String description;
    private Date startDate;
    private Category category;
    private Status status;

    public Project(int code, Date deadLine, String name, String description, Date startDate, Category category, Status status)
    {
        this.code = code;
        this.deadLine = deadLine;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.category = category;
        this.status = status;
    }

    public int getCode()
    {
        return code;
    }

    public void setCode(int code)
    {
        this.code = code;
    }

    public Date getDeadLine()
    {
        return deadLine;
    }

    public void setDeadLine(Date deadLine)
    {
        this.deadLine = deadLine;
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

    public Date getStartDate()
    {
        return startDate;
    }

    public void setStartDate(Date startDate)
    {
        this.startDate = startDate;
    }

    public Category getCategory()
    {
        return category;
    }

    public void setCategory(Category category)
    {
        this.category = category;
    }

    public Status getStatus()
    {
        return status;
    }

    public void setStatus(Status status)
    {
        this.status = status;
    }
}
