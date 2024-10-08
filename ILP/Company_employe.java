package ILP;

import java.util.*;

class Employee {
    private int id;
    private String name;
    private String designation;
    private double salary;

    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public String getDesignation() {
        return this.designation;
    }
}

class Company {
    private String companyName;
    private Employee[] emp;
    private int numEmployees;

    public Company(String companyName, Employee[] emp, int numEmployees) {
        this.companyName = companyName;
        this.emp = emp;
        this.numEmployees = numEmployees;
    }

    public double getAverageSalary(Employee[] e) {
        double sum = 0;
        for (int i = 0; i < e.length; i++) {
            sum += e[i].getSalary();
        }
        if (sum > 0) {
            double avg = sum / e.length;
            return avg;
        }
        return 0;
    }

    public double getMaxSalary(Employee[] e)
    {
        double maxi = Double.MIN_VALUE;
        for(int i = 0; i < e.length; i++)
        {
            if(e[i].getSalary() > maxi)
            {
                maxi = e[i].getSalary();
            }
        }
        return maxi;
    }
}

public class Company_employe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the company name: ");
        String ch = sc.nextLine();
        System.out.print("Enter number of employe");
        int num = sc.nextInt();
        sc.nextLine();
        Employee[] emp = new Employee[num];
        System.out.println("Enter employe details");
        for (int i = 0; i < num; i++) {
            System.out.print("Employee " + (i + 1) + ":");
            System.out.print("Enter id: ");
            int a = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter name: ");
            String b = sc.nextLine();

            System.out.print("Enter designation: ");
            String c = sc.nextLine();

            System.out.print("Enter salary: ");
            double d = sc.nextDouble();
            sc.nextLine();

            emp[i] = new Employee(a,b,c,d);
        }
        Company comp = new Company(ch , emp , num);

        System.out.println("Average Salary : "+comp.getAverageSalary(emp));
        System.out.println("Max Salary : "+comp.getMaxSalary(emp));

        System.out.print("Enployee with Designation: ");
        String desi = sc.nextLine();
    }

}
