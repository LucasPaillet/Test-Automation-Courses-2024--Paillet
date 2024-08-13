package models.project;

import models.status.Status;

import java.util.Date;

public class Task
{
    private String code;
    private int complexity;
    private int estimatedTime;
    private Date startDate;
    private Status status;

    public Task(String code, int complexity, int estimatedTime, Date startDate, Status status)
    {
        this.code = code;
        this.complexity = complexity;
        this.estimatedTime = estimatedTime;
        this.startDate = startDate;
        this.status = status;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public int getComplexity()
    {
        return complexity;
    }

    public void setComplexity(int complexity)
    {
        this.complexity = complexity;
    }

    public int getEstimatedTime()
    {
        return estimatedTime;
    }

    public void setEstimatedTime(int estimatedTime)
    {
        this.estimatedTime = estimatedTime;
    }

    public Date getStartDate()
    {
        return startDate;
    }

    public void setStartDate(Date startDate)
    {
        this.startDate = startDate;
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
