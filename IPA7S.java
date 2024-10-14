import java.util.*;

class Sim {
    private int simId;
    private String customerName;
    private double balance;
    private double ratePerSecond;
    private String circle;

    public Sim(int simId, String customerName, double balance, double ratePerSecond, String circle) {
        this.simId = simId;
        this.customerName = customerName;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }

    public int getSimId() {
        return simId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public double getRatePerSecond() {
        return ratePerSecond;
    }

    public String getCircle() {
        return circle;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }
}

public class IPA7S {
    public static Sim[] transferCustomerCircle(Sim[] sims, String circle1, String circle2) {
        List<Sim> transferredList = new ArrayList<>();
        
        for (Sim sim : sims) {
            if (sim.getCircle().equals(circle1)) {
                sim.setCircle(circle2);
                transferredList.add(sim);
            }
        }
        
        transferredList.sort((s1, s2) -> Double.compare(s2.getRatePerSecond(), s1.getRatePerSecond()));
        
        return transferredList.toArray(new Sim[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of Sim objects
        System.out.println("Enter the size:");
        int num1 = sc.nextInt();
        sc.nextLine(); // Consume the newline
        
        Sim[] sims = new Sim[num1];
        
        // Read the details for each Sim object
        for (int i = 0; i < num1; i++) {
            System.out.println("Enter the details of Sim " + (i + 1));
            int simId = sc.nextInt();
            sc.nextLine(); // Consume the newline
            String customerName = sc.nextLine();
            double balance = sc.nextDouble();
            double ratePerSecond = sc.nextDouble();
            sc.nextLine(); // Consume the newline
            String circle = sc.nextLine();
            
            sims[i] = new Sim(simId, customerName, balance, ratePerSecond, circle);
        }
        
        // Read the circle to find and replace
        System.out.println("Enter a circle to find and replace:");
        String circle1 = sc.nextLine();
        String circle2 = sc.nextLine();
        
        // Get the result after transferring customers
        Sim[] transferredSims = transferCustomerCircle(sims, circle1, circle2);
        
        // Display the results
        for (Sim sim : transferredSims) {
            System.out.println(sim.getSimId() + " " + sim.getCustomerName() + " " + sim.getCircle() + " " + sim.getRatePerSecond());
        }
        
        sc.close();
    }
}
