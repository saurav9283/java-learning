package PRA;
import java.util.*;

class PricePerUnitIsNegativeException extends Exception{
    public PricePerUnitIsNegativeException(String message)
    {
        super(message);
    }
}

class Orders{
    private int orderId;
    private String productName;
    private double pricePerUnit;
    private int quantity;

    public Orders(int orderId , String productName, double pricePerUnit,int quantity) throws PricePerUnitIsNegativeException
    {
        if(pricePerUnit < 0)
        {
            throw new PricePerUnitIsNegativeException("Price perunit is not negative");
        }
        this.orderId = orderId;
        this.productName = productName;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    public int getOrderId()
    {
        return orderId;
    }
    public String getOrderName()
    {
        return productName;
    }
    public double getpriceperunit()
    {
        return pricePerUnit;
    }
    public int getquantity()
    {
        return quantity;
    }
}

class Inventory{
    private int inventoryId;
    private String inventoryName;
    private int noOfOrders;
    private List<Orders> orders;

    public Inventory(int inventoryId, String inventoryName, int noOfOrders, List<Orders> orders)
    {
        this.inventoryId = inventoryId;
        this.inventoryName = inventoryName;
        this.noOfOrders =noOfOrders;
        this.orders = orders;
    }
    public int getinventoryId()
    {
        return inventoryId;
    }
    public String getinventoryName()
    {
        return inventoryName;
    }
    public int getnoOfOrders()
    {
        return noOfOrders;
    }
    public List<Orders> getOrder()
    {
        return orders;
    }
}

class Service{
    public void calculateTotalCostByProductName(List<Inventory> inventories , String productName)
    {
        double total = 0;

        for(Inventory inventory:inventories)
        {
            for(Orders order: inventory.getOrder())
            {
                if(order.getOrderName().equalsIgnoreCase(productName))
                {
                    total += order.getquantity()*order.getpriceperunit();
                }
            }
        }
        if(total > 0)
        {
            System.out.println((int)total);
        }
        else{
            System.out.println("No Product Found with Mentioned Name");
        }
    }

    public void findNamesOfProductByInventoryId(List<Inventory> inventories , int searchId)
    {
        for(Inventory inventory:inventories)
        {
            if(inventory.getinventoryId()==searchId)
            {
                for(Orders order: inventory.getOrder())
                {
                    System.out.println(order.getOrderName());
                }
                return;
            }
        }
    }
}

public class PRA20{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int noOfInv = sc.nextInt();sc.nextLine();
        List<Inventory> inventories = new ArrayList<>();

        for(int i = 0; i < noOfInv; i++)
        {
            int inventoryId = sc.nextInt();sc.nextLine();
            String inventoryName = sc.nextLine();
            int noOfOrders = sc.nextInt();sc.nextLine();
            List<Orders> listOrders = new ArrayList<>();
            
            for(int j = 0; j < noOfOrders; j++)
            {
                int orderId = sc.nextInt();sc.nextLine();
                String productName = sc.nextLine();
                double pricePerUnit = sc.nextDouble();
                int quantity = sc.nextInt();sc.nextLine();
                try {
                    listOrders.add(new Orders(orderId, productName, pricePerUnit, quantity));
                } catch (PricePerUnitIsNegativeException e) {
                    System.out.println(e.getMessage());
                    return;
                }
            }
            inventories.add(new Inventory(inventoryId, inventoryName, noOfOrders, listOrders));
        }

        String productNameToFind = sc.nextLine();
        int inventoryIdToFind = sc.nextInt();sc.nextLine();
        Service services = new Service();
        services.calculateTotalCostByProductName(inventories,productNameToFind);
        services.findNamesOfProductByInventoryId(inventories,inventoryIdToFind);
    }
}