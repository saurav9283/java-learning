import java.util.*;

class Employee{
    private int EmpId;
    private String EmpName;
    private String Dept;
    private int Rating;
    private int Salary;

    public Employee(int EmpId,String EmpName, String Dept, int Rating, int Salary)
    {
        this.EmpId = EmpId;
        this.EmpName =  EmpName;
        this.Dept = Dept;
        this.Rating =  Rating;
        this.Salary = Salary;
    }
    public int getid()
    {
        return EmpId;
    }
    public String getname()
    {
        return EmpName;
    }
    public String getdepth()
    {
        return Dept;
    }
    public int getrating()
    {
        return Rating;
    }
    public int getSalary()
    {
        return Salary;
    }
}

public class IPA52Solution{
    public static String[] findDept(Employee[] employes, int find)
    {
        List<String> deps = new ArrayList<>();
        for(Employee employe : employes)
        {
            if(employe.getSalary() == find && employe.getrating() >= 3)
            {
                deps.add(employe.getdepth());
            }
        }
        if(deps.isEmpty())
        {
            return null;
        }
        else{
            return deps.toArray(new String[0]);
        }
    }
    public static Employee findSecondHighestSalary(Employee[] employes, String find)
    {
        List<Employee> list = new ArrayList<>();
        for(Employee emp:employes)
        {
            if(emp.getdepth().equalsIgnoreCase(find))
            {
                list.add(emp);
            }
        }
        list.sort(Comparator.comparing(Employee::getSalary).reversed());
        if(list.isEmpty())
        {
            return null;
        }
        else 
        {
            return list.get(1);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Employee[] employe = new Employee[5];
        for(int i = 0; i < 5; i++)
        {
            int EmpId =sc.nextInt();sc.nextLine();
            String EmpName = sc.nextLine();
            String Dept = sc.nextLine();
            int Rating = sc.nextInt();sc.nextLine();
            int Salary =  sc.nextInt();sc.nextLine();

            employe[i] = new Employee(EmpId, EmpName, Dept, Rating, Salary);
        }
        int findamount = sc.nextInt();sc.nextLine();
        String search = sc.nextLine();
        String[] depts =  findDept(employe,findamount);
        if(depts != null)
        {
            System.out.println(String.join(", ", depts));
        }
        else{
            System.out.println("No Department found");
        }

        Employee high = findSecondHighestSalary(employe,search);
        if(high != null)
        {
            System.out.println(high.getSalary());
        }


    }
}