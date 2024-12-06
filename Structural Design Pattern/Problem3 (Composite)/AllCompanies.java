package Problem3;

import java.util.ArrayList;
import java.util.List;

public class AllCompanies implements IEmployee{

    public List<Company>allCompanyeList;

    public AllCompanies() {
        this.allCompanyeList = new ArrayList<Company>();
    }

    public void addCompany(Company c)
    {
        allCompanyeList.add(c);
    }
    public void removeCompany(Company c)
    {
        allCompanyeList.remove(c);
    }
    @Override
    public void printStructures() {

    }

    @Override
    public int getEmployeeCount() {
        return 0;
    }
}
