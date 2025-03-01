import java.util.*;

class Perfume {
    private int perfumeId;
    private String brand;
    private double price;
    private String fragrance;

    public Perfume(int perfumeId, String brand, double price, String fragrance) {
        this.perfumeId = perfumeId;
        this.brand = brand;
        this.price = price;
        this.fragrance = fragrance;
    }

    public int getPerfumeId() {
        return perfumeId;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String getFragrance() {
        return fragrance;
    }
}

class Customer {
    private int customerId;
    private String name;
    private int age;
    private String gender;
    private List<Perfume> availablePerfumes;

    public Customer(int customerId, String name, int age, String gender, List<Perfume> availablePerfumes) {
        this.customerId = customerId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.availablePerfumes = availablePerfumes;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public List<Perfume> getAvailablePerfumes() {
        return availablePerfumes;
    }
}

class Service {
    public void findCustomersWithPerfumeBrand(List<Customer> listCustomers, String find) {
        List<String> ans = new ArrayList<>();

        for (Customer c : listCustomers) {
            for (Perfume p : c.getAvailablePerfumes()) {
                if (p.getBrand().equalsIgnoreCase(find)) {
                    ans.add(c.getName()); 
                    break;
                }
            }
        }

        if (!ans.isEmpty()) {
            for (String a : ans) {
                System.out.println(a);
            }
        } else {
            System.out.println("No matching customers found.");
        }
    }

    public void calculateTotalExpenditure(List<Customer> customers)
    {
        double total = 0;
        for(Customer c:customers)
        {
            for(Perfume p:c.getAvailablePerfumes())
            {
                total += p.getPrice();
            }
        }
        System.out.println(total);
    }
}

public class PRA26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNoOfCustomer = sc.nextInt();
        sc.nextLine();
        List<Customer> customersList = new ArrayList<>();

        for (int i = 0; i < totalNoOfCustomer; i++) {
            int customerId = sc.nextInt();
            sc.nextLine();
            String customerName = sc.nextLine();
            int age = sc.nextInt();
            sc.nextLine();
            String gender = sc.nextLine();

            int numberOfPerfumeList = sc.nextInt();
            sc.nextLine();
            List<Perfume> perfumesList = new ArrayList<>();

            for (int j = 0; j < numberOfPerfumeList; j++) {
                int perfumeId = sc.nextInt();
                sc.nextLine();
                String brand = sc.nextLine();
                double price = sc.nextDouble();
                sc.nextLine();
                String fragrance = sc.nextLine();
                perfumesList.add(new Perfume(perfumeId, brand, price, fragrance));
            }
            customersList.add(new Customer(customerId, customerName, age, gender, perfumesList));
        }

        String findPerfume = sc.nextLine();
        Service s = new Service();
        s.findCustomersWithPerfumeBrand(customersList, findPerfume);
        s.calculateTotalExpenditure(customersList);
    }
}
