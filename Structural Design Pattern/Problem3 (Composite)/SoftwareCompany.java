package Problem3;

import java.util.Scanner;

public class SoftwareCompany {
    public static void main(String[] args) {
        String companyName, project, manager, developer, developerProject, oldName = null;
        AllCompanies allCompanies = new AllCompanies();
        ProjectManager projectManager1 = new ProjectManager();
        Developer developer1 = new Developer();
        Company company1 = new Company();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 to give input,0 to exit");
        int input = scanner.nextInt();
        while (input == 1) {

            System.out.println("Enter Company name : ");
            companyName = scanner.next();
            if (oldName == null || !(oldName.equalsIgnoreCase(companyName))) {
                company1 = new Company(companyName);
                allCompanies.addCompany(company1);
            }

            System.out.println("Enter project manager's name : (n to null)");
            manager = scanner.next();
            System.out.println("Enter project's name : ");
            project = scanner.next();
            if (manager.equalsIgnoreCase("n") == false) {
                projectManager1 = new ProjectManager(manager, " Project Manager", project);
                company1.addManager(projectManager1);
            }
            System.out.println("Enter developer's name : (n to null)");
            developer = scanner.next();
            System.out.println("Enter developer's project name : ");
            developerProject = scanner.next();
            if (developer.equalsIgnoreCase("n") == false) {
                developer1 = new Developer(developer, "Developer", developerProject);
                if (company1.projectManagerList.size() != 0) {
                    System.out.println("Details of the developer : ");
                    developer1.Details();
                } else
                    System.out.println("Add a proejct manager first in company" + companyName);
                System.out.println();
                if (developerProject.equalsIgnoreCase(project) && manager.equalsIgnoreCase("n") == false) {
                    projectManager1.addDeveloper(developer1);

                }
            }
            System.out.println("Details of the project manager : ");
            projectManager1.Details();

//        Developer developer2= new Developer("John von Neumann","Developer","CSE 308");
//        Developer developer3= new Developer("Alfred Aho","Developer","CSE 307");

            //ProjectManager projectManager2 = new ProjectManager("David Patterson"," Project Manager","CSE 307");

            //projectManager1.addDeveloper(developer2);

            System.out.println("List of the companies :");
            for (Company company : allCompanies.allCompanyeList) {
                company.printStructures();
                System.out.println("\tTotal number of Employees in this company : " + company.getEmployeeCount());
                System.out.println();

            }
            oldName = companyName;
            System.out.println("Press 1 to continue,0 to exit ");
            input = scanner.nextInt();

        }
//        projectManager2.addDeveloper(developer3);

//        company1.addManager(projectManager2);


        while (true) {
            System.out.println("Want to remove an employee ? Press 1 to remove developer,2 to remove project manager,3 to remove company,0 to skip ");
            input = scanner.nextInt();
            Developer ddev = null;
            ProjectManager pm = null;
            Company cm = null;
            if (input == 1) {
                System.out.println("Enter name to sack ");
                String s = scanner.next();
                for(Company c:allCompanies.allCompanyeList) {
                    for (ProjectManager projectManager : c.projectManagerList) {
                        for (Developer dev : projectManager.employeeList) {
                            if (dev.getName().equalsIgnoreCase(s)) {
                                ddev = dev;
                                break;
                            }
                        }
                            if (ddev != null) {
                                projectManager.removeDeveloper(ddev);
                                System.out.println(s + " is removed successfully");
                                for (Company company : allCompanies.allCompanyeList) {
                                    System.out.println("Any change will be shown here");
                                    company.printStructures();
                                    System.out.println("\tTotal number of Employees in this company : " + company.getEmployeeCount());
                                    System.out.println();

                                }

                            }
                            else
                                System.out.println("Developer is not present in the companies");

                        }
                    }

            } else if (input == 2) {
                System.out.println("Enter name to sack ");
                String s = scanner.next();
                for (Company c : allCompanies.allCompanyeList) {

                    for (ProjectManager p : c.projectManagerList) {
                        //System.out.println("fdfhfgjf");
                        if (p.getName().equalsIgnoreCase(s)) {
                            pm = p;
                            break;
                        }
                    }
                    if(pm != null) {
                        if (pm.getEmployeeCount() == 0) {
                            c.removeManager(pm);
                            System.out.println(s + " is removed successfully");
                            for (Company company : allCompanies.allCompanyeList) {
                                System.out.println("Any change will be shown here");
                                company.printStructures();
                                System.out.println("\tTotal number of Employees in this company : " + company.getEmployeeCount());
                                System.out.println();

                            }

                        } else
                            System.out.println("Delete the developers  of project manager " + s + " first"+"of company "+c.getName());

                    }
                }

            } else if (input == 3) {
                System.out.println("Enter a company name to remove ");
                String s = scanner.next();
                for (Company p : allCompanies.allCompanyeList) {
                    if (p.getName().equalsIgnoreCase(s)) {
                        cm = p;
                        break;
                    }
                }
                if (cm.getEmployeeCount() == 0 && cm != null) {
                    allCompanies.removeCompany(cm);
                    System.out.println(s + " is removed successfully");
                    for (Company company : allCompanies.allCompanyeList) {
                        System.out.println("Any change will be shown here");
                        company.printStructures();
                        System.out.println("\tTotal number of Employees in this company : " + company.getEmployeeCount());
                        System.out.println();

                    }
                } else
                    System.out.println("Delete the developers first and then the project managers of company " + s);


            } else
                break;
        }

//        projectManager1.removeDeveloper(developer1);
//       // company1.removeManager(projectManager1);
//        allCompanies.removeCompany(company1);


    }
}
