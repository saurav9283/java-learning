import java.util.*;

class Employee {
    private int id;
    private String name;
    private int age;
    private char gender;
    private double salary;

    public Employee(int id, String name, int age, char gender, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public char getGender() {
        return this.gender;
    }

    public double getSalary() {
        return this.salary;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline
        Employee[] emp = new Employee[n];

        // Input employee details
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline after integer input
            String name = sc.nextLine();
            int age = sc.nextInt();
            char gender = sc.next().charAt(0);
            double salary = sc.nextDouble();
            sc.nextLine(); // Consume newline after double input

            emp[i] = new Employee(id, name, age, gender, salary);
        }

        // Read the age to find employees based on age
        int age = sc.nextInt();

        // Get employee with second lowest salary
        Employee secondLowestSalaryEmployee = getEmployeeWithSecondLowestSalary(emp);
        if (secondLowestSalaryEmployee != null) {
            System.out.println(secondLowestSalaryEmployee.getId() + "#" + secondLowestSalaryEmployee.getName());
        } else {
            System.out.println("Null");
        }

        // Count employees based on age
        int ageCount = countEmployeesBasedOnAge(emp, age);
        if (ageCount > 0) {
            System.out.println(ageCount);
        } else {
            System.out.println("No employee found for the given age");
        }
    }

    public static Employee getEmployeeWithSecondLowestSalary(Employee[] emp) {
        if (emp.length < 2) {
            return null;
        }
        Arrays.sort(emp, Comparator.comparingDouble(Employee::getSalary));
        return emp[1];
    }

    public static int countEmployeesBasedOnAge(Employee[] emp, int age) {
        int count = 0;
        for (Employee employee : emp) {
            if (employee.getAge() == age) {
                count++;
            }
        }
        return count;
    }
}
