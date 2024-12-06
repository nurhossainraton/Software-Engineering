package Problem3;

import java.util.ArrayList;
import java.util.List;

public class Company implements IEmployee{
    String name;
    public List<ProjectManager> projectManagerList;
    int employeeCount =0;
    public Company(String name) {
        this.name = name;
        projectManagerList = new ArrayList<ProjectManager>();
    }
    public List<ProjectManager> getProjectManagerList()
    {
        return projectManagerList;
    }
    public Company() {

    }

    public void addManager(ProjectManager e)
    {
        projectManagerList.add(e);
    }
    public void removeManager(ProjectManager e)
    {
        projectManagerList.remove(e);
    }
    @Override
    public void printStructures() {
        System.out.println("\t - "+this.name);
        for(IEmployee employee:projectManagerList)
        {
            employee.printStructures();
        }
    }

    @Override
    public int getEmployeeCount() {
//         for(ProjectManager projectManager: projectManagerList)
//         {
//             if(projectManager.getName().equalsIgnoreCase("null") == false)
//                 employeeCount+=1;
//         }
        employeeCount = projectManagerList.size();
        for(IEmployee e: projectManagerList)
        {
            employeeCount += e.getEmployeeCount();
        }
        return employeeCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
