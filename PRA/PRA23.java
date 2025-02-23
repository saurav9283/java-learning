package PRA;
import java.util.*;

class PriceisNegativeException extends Exception{
    public PriceisNegativeException(String message)
    {
        super(message);
    }
}

class Cycle{
    private int cycleId;
    private String cycleName;
    private int price;
    public Cycle(int cycleId,String cycleName,int price) throws PriceisNegativeException
    {
        if(price < 0)
        {
            throw new PriceisNegativeException("Invalid Price: Price cannot be negative.");
        }
        this.cycleId = cycleId;
        this.cycleName = cycleName;
        this.price = price;
    }
    public int getcycleId()
    {
        return cycleId;
    }
    public String getcycleName()
    {
        return cycleName;
    }
    public int getprice()
    {
        return price;
    }
}

class Customer{
    private int customerId;
    private String customerName;
    private int noofcycles;
    private List<Cycle> cycles;
    public Customer(int customerId,String customerName, int noofcycles,List<Cycle> cycles)
    {
        this.customerId = customerId;
        this.customerName = customerName;
        this.noofcycles = noofcycles;
        this.cycles = cycles;
    }
    public int getCustomerId()
    {
        return customerId;
    }
    public String getcustomerName()
    {
        return customerName;
    }
    public int getnoofcycles()
    {
        return noofcycles;
    }
    public List<Cycle> getCycleList()
    {
        return cycles;
    }
}

class Service{
    public void CalculateTotalPriceByCycleName(List<Customer> customers,String findName)
    {
        int total = 0;
        for(Customer c:customers)
        {
            for(Cycle cy:c.getCycleList())
            {
                if(cy.getcycleName().equalsIgnoreCase(findName))
                {
                    total += cy.getprice();
                }
            }
        }
        if(total == 0)
        {
            System.out.println("No cycle found with mentioned name.");
        }
        else{
            System.out.println(total);
        }
    }
    public List<String> findCustomerNamesOfCyclesByPrice(List<Customer> customers, int findPrice)
    {
        List<String> ans = new ArrayList<>();
        for(Customer c:customers)
        {
            for(Cycle cy:c.getCycleList())
            {
                if(cy.getprice() > findPrice)
                {
                    ans.add(c.getcustomerName());
                }
            }
        }
        return ans;

    }
}

public class PRA23{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int noOfCumtomer = sc.nextInt();sc.nextLine();
        List<Customer> customersList = new ArrayList<>();
        for(int i = 0; i < noOfCumtomer; i++)
        {
            int customerId = sc.nextInt();sc.nextLine();
            String customerName = sc.nextLine();
            int noofcycles = sc.nextInt();
            List<Cycle> cyclesList = new ArrayList<>();
            for(int j = 0; j < noofcycles; j++)
            {
                int cycleId = sc.nextInt();sc.nextLine();
                String cycleName = sc.nextLine();
                int price = sc.nextInt();sc.nextLine();
                try {
                    cyclesList.add(new Cycle(cycleId,cycleName,price));
                } catch (PriceisNegativeException e) {
                    System.out.println(e.getMessage());
                }
            }
            customersList.add(new Customer(customerId,customerName,noofcycles,cyclesList));

        }
        String findName =sc.nextLine();
        int findPrice = sc.nextInt();sc.nextLine();

        Service service = new Service();
        service.CalculateTotalPriceByCycleName(customersList,findName);
        List<String> ansList = service.findCustomerNamesOfCyclesByPrice(customersList,findPrice);
        if(ansList.isEmpty())
        {
            System.out.println("No matching customers found.");
        }
        else{
            for(String s:ansList)
            {
                System.out.println(s);
            }
        }
    }

}