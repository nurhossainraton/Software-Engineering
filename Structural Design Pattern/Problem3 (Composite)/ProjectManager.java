package Problem3;

import java.util.ArrayList;
import java.util.List;

public class ProjectManager implements IEmployee{
    public String name,role,currentProject;
    private int employeeCount = 0;
    public List<Developer> employeeList;

    public ProjectManager(String name, String role, String currentProject) {
        this.name = name;
        this.role = role;
        this.currentProject = currentProject;
        employeeList = new ArrayList<Developer>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProjectManager() {
        employeeList = new ArrayList<Developer>();
    }

    public void addDeveloper(Developer e)
    {
        employeeList.add(e);
    }
    public void removeDeveloper(Developer e)
    {
        employeeList.remove(e);
    }
    @Override
    public void printStructures() {
        System.out.println("\t\t - "+this.name+" ("+this.currentProject+") ");
        for(IEmployee employee:employeeList)
        {
            employee.printStructures();
        }
    }

    @Override
    public int getEmployeeCount() {
//        for(Developer developer:employeeList)
//        {
//            if(developer.getName().equalsIgnoreCase("null") == false)
//                employeeCount+=1;
//        }
        employeeCount = employeeList.size();
         for(Developer e: employeeList)
         {
             employeeCount += e.getEmployeeCount();
         }
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
