import java.util.*;

class Employee {
    private int employeeld;
    private String name;
    private String branch;
    private double rating;
    private boolean company_Transport;

    public Employee(int employeeld, String name, String branch, double rating, boolean company_Transport) {
        this.employeeld = employeeld;
        this.name = name;
        this.branch = branch;
        this.rating = rating;
        this.company_Transport = company_Transport;
    }

    public int getemployeeld() {
        return employeeld;
    }

    public String getname() {
        return name;
    }

    public String getbranch() {
        return branch;
    }

    public double getrating() {
        return rating;
    }

    public boolean getcompany_Transport() {
        return company_Transport;
    }
}

public class IPA10Solution {

    public static int findCountOfEmployeesUsingCompTransport(Employee[] employes) {
        int count = 0;
        for (Employee employe : employes) {
            if (employe.getcompany_Transport() == true) {
                count++;
            }
        }
        return count;
    }

    public static Employee findEmployeeWithSecondHighestRating(Employee[] employes) {
        List<Employee> list = new ArrayList<>();
        for (Employee employe : employes) {
            if (employe.getcompany_Transport() == false) {
                list.add(employe);
            }
        }
        list.sort(Comparator.comparingDouble(Employee::getrating));
        return list.get(list.size() - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employe = new Employee[4];

        for (int i = 0; i < 4; i++) {
            int employeeld = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String branch = sc.nextLine();
            double rating = sc.nextDouble();
            sc.nextLine();
            boolean company_Transport = sc.nextBoolean();
            sc.nextLine();

            employe[i] = new Employee(employeeld, name, branch, rating, company_Transport);
        }

        int ans = findCountOfEmployeesUsingCompTransport(employe);
        System.out.println(ans);

        Employee newlist = findEmployeeWithSecondHighestRating(employe);
        if (newlist != null) {

            System.out.println(newlist.getemployeeld());
            System.out.println(newlist.getname());
        }

    }
}