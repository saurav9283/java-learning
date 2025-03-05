package PRA;
import java.util.*;

class SalaryisNegativeException extends Exception{
    public SalaryisNegativeException(String message)
    {
        super(message);
    }
}

class Employee{
    private int employeId;
    private String employeName;
    private int salary;
    public Employee(int employeId, String employeName,int salary) throws SalaryisNegativeException
    {
        if(salary < 0)
        {
            throw new SalaryisNegativeException("Salary Can not be Negative");
        }
        this.employeId = employeId;
        this.employeName = employeName;
        this.salary = salary;
    }
    public int getempId()
    {
        return employeId;
    }
    public String getEmpName()
    {
        return employeName;
    }
    public int getSalry()
    {
        return salary;
    }
}

class Unit{
    private int unitId;
    private String unitName;
    private int budge;
    private List<Employee> employees;
    public Unit(int unitId, String unitName,int budge,List<Employee> employees)
    {
        this.unitId = unitId;
        this.unitName = unitName;
        this.budge = budge;
        this.employees = employees;
    }
    public int getUnitId()
    {
        return unitId;
    }
    public String getunitName()
    {
        return unitName;
    }
    public int getbudge()
    {
        return budge;
    }
    public List<Employee> getListEmployees()
    {
        return employees;
    }
}

class Service{
    public int TotalSalaryByEmpName(List<Unit> units, String findEmp)
    {
        for(Unit u:units)
        {
            for(Employee e:u.getListEmployees())
            {
                if(e.getEmpName().equalsIgnoreCase(findEmp))
                {
                    return e.getSalry();
                }
            }
        }
        return 0;
    }

    public List<String> findUnitNamebyEmp(List<Unit> units, int findSalary)
    {
        List<String> ans = new ArrayList<>();
        for(Unit u:units)
        {
            for(Employee e:u.getListEmployees()){
                if(e.getSalry() > findSalary)
                {
                    ans.add(u.getunitName());
                    break;
                }
            }
        }
        return ans;
    }

}

public class MR_PRA31{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numberOfunit = sc.nextInt();sc.nextLine();
        List<Unit> unitList = new ArrayList<>();

        for(int i  =0 ; i <  numberOfunit; i++)
        {
            int unitId =  sc.nextInt();sc.nextLine();
            String unitName =  sc.nextLine();
            int numberOfEmploye = sc.nextInt();sc.nextLine();

            List<Employee> employeeList = new ArrayList<>();
            for(int j = 0; j < numberOfEmploye;j++)
            {
                int empId = sc.nextInt();sc.nextLine();
                String empName = sc.nextLine();
                int salary =sc.nextInt();sc.nextLine();
                try {
                    employeeList.add(new Employee(empId, empName, salary));
                } catch (SalaryisNegativeException e) {
                    // TODO: handle exception
                    System.out.println(e.getMessage());
                }
            }
            unitList.add(new Unit(unitId, unitName, numberOfEmploye, employeeList));
        }

        String empFindName = sc.nextLine();
        int findbysalary = sc.nextInt();sc.nextLine();
        Service service = new Service();
        int ansSalary = service.TotalSalaryByEmpName(unitList,empFindName);
        if(ansSalary!=0)
        {
            System.out.println(ansSalary);
        }
        else{
            System.out.println("No employee Found");
        }

        List<String> resultName = service.findUnitNamebyEmp(unitList,findbysalary);
        if(!resultName.isEmpty())
        {
            System.out.println(resultName);
        }
        else{
            System.out.println("No matching unit founnd");
        }
    }
}