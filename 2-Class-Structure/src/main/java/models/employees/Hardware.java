package models.employees;

import models.status.Status;

public class Hardware
{
    private final String code;
    private int totalRAM;
    private int diskCapacity;
    private String os;
    private Status status;

    public Hardware(String code, int totalRAM, int diskCapacity, String os, Status status)
    {
        this.code = code;
        this.totalRAM = totalRAM;
        this.diskCapacity = diskCapacity;
        this.os = os;
        this.status = status;
    }

    public String getCode()
    {
        return code;
    }

    public int getTotalRAM()
    {
        return totalRAM;
    }

    public void setTotalRAM(int totalRAM)
    {
        this.totalRAM = totalRAM;
    }

    public int getDiskCapacity()
    {
        return diskCapacity;
    }

    public void setDiskCapacity(int diskCapacity)
    {
        this.diskCapacity = diskCapacity;
    }

    public String getOs()
    {
        return os;
    }

    public void setOs(String os)
    {
        this.os = os;
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
