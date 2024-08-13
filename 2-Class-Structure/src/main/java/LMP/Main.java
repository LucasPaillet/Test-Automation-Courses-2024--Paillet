package LMP;

import models.employees.*;
import models.project.*;
import models.status.Status;

import java.util.Date;

public class Main {
    public static void main(String[] args)
    {
        //Status definition
        Status assigned = new Status("Assigned", "Hardware assigned", "Hardware");
        Status free = new Status("Free", "Hardware without assignement", "Hardware");
        Status initialized = new Status("Initialized", "Project initializated", "Project");
        Status inProgress = new Status("In Progress", "Project in progress", "Project");
        Status created = new Status("Created", "Task created", "Task");
        Status finalized = new Status("Finalized", "Task finished", "Task");

        // Hardware definition
        Hardware windows11Note = new Hardware("W11-001", 12, 500, "Windows", assigned);
        Hardware linuxUbuntuNote = new Hardware("LU-001", 12, 500, "Linux Ubuntu", free);

        // Skills definition
        Skills angular = new Skills("Angular frontend develop", "Components development in Angular", "Frontend");
        Skills react = new Skills("React frontend develop", "Components development in React", "Frontend");
        Skills java = new Skills("Java backend develop", "Class development in Java", "Backend");
        Skills python = new Skills("Python backend develop", "Class development in Python", "Backend");
        Skills django = new Skills("Django develop", "Django development", "Backend and Frontend");

        // Role definition
        Skills[] javaSkills = {angular, java};
        Role javaDeveloper = new Role(2000, "Java Developer", "Backend and frontend developer with Java technologies", javaSkills);
        Skills[] pythonSkills = {react, python};
        Role pythonDeveloper = new Role(2000, "Python Developer", "Backend and frontend developer with Python technologies", pythonSkills);

        // Employees definition
        Date hiringDate = new Date();
        Skills[] marioESkills = {react, python, django};
        Employee lucasE = new Employee("Lucas", "Paillet", hiringDate, javaDeveloper, javaSkills);
        lucasE.setAssignedHardware(linuxUbuntuNote);
        Employee marioE = new Employee("Mario", "Paillet", hiringDate, pythonDeveloper, marioESkills);
        Employee pailletE = new Employee("", "Paillet", hiringDate, pythonDeveloper, pythonSkills);

        // Tasks definition
        Date startingDate = new Date();
        Task frontTask011 = new Task("01-1", 3, 12, startingDate, created);
        Task frontTask012 = new Task("01-2", 5, 18, startingDate, finalized);
        Task backTask021 = new Task("02-1", 3, 12, startingDate, finalized);
        Task backTask022 = new Task("02-2", 8, 30, startingDate, finalized);

        // User Stories definition
        Task[] taskUserFront = {frontTask011, frontTask012};
        Task[] taskUserBack = {backTask021, backTask022};
        UserStory userFront = new UserStory(1, 5, "", taskUserFront);
        UserStory backFront = new UserStory(2, 8, "", taskUserBack);

        // Categories
        Role[] requiredRolesTesting = {javaDeveloper, pythonDeveloper};
        Category testingProject = new Category("Pure testing Project", "Test an entire project without development", requiredRolesTesting);

        // Project definition
        UserStory[] usList = {userFront, backFront};
        Project testProjectNN = new Project(1, new Date(), "Testing in WebApp NN", "Test all the functionalities of the App NN - Client AA", new Date(), testingProject, initialized);

        // Clients definition
        Client clientAA = new Client("email@gmail.com", testProjectNN, "AA", "A random company");

        // Teams definition
        Employee[] teamMembers1 = {lucasE};
        Employee[] teamMembers2 = {marioE, pailletE};
        Team team1 = new Team(1, false, teamMembers1, lucasE, "Team Cordoba");
        team1.setAssignedProject(testProjectNN);
        team1.setOnProject(true);
        Team team2 = new Team(1, false, teamMembers2, marioE, "Team Buenos Aires");
    }
}