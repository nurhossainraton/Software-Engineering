package Problem3;

public class Developer implements IEmployee{
    public String name,role,currentProject;
    private int employeeCount = 0;

    public Developer(String name, String role, String currentProject) {
        this.name = name;
        this.role = role;
        this.currentProject = currentProject;
    }

    public Developer() {

    }

    @Override
    public void printStructures() {
        System.out.println("\t\t\t - "+this.name);

    }

    public String getName() {
        return name;
    }

    @Override
    public int getEmployeeCount() {
        return employeeCount;
    }
    public void Details()
    {
        System.out.println("Name : "+this.name);
        System.out.println("Role : "+this.role);
        System.out.println("Current Project : "+this.currentProject);
        System.out.println("Number Of Supervisees : "+getEmployeeCount());
        System.out.println("-----------------------------");

    }
}
