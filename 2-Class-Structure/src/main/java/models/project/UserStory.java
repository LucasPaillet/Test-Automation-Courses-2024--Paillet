package models.project;

public class UserStory
{
    private int code;
    private int complexity;
    private String acceptanceCriteria;
    private Task[] tasks;

    public UserStory(int code, int complexity, String acceptanceCriteria, Task[] tasks)
    {
        this.code = code;
        this.complexity = complexity;
        this.acceptanceCriteria = acceptanceCriteria;
        this.tasks = tasks;
    }

    public int getCode()
    {
        return code;
    }

    public void setCode(int code)
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

    public String getAcceptanceCriteria()
    {
        return acceptanceCriteria;
    }

    public void setAcceptanceCriteria(String acceptanceCriteria)
    {
        this.acceptanceCriteria = acceptanceCriteria;
    }

    public Task[] getTasks()
    {
        return tasks;
    }

    public void setTasks(Task[] tasks)
    {
        this.tasks = tasks;
    }
}
