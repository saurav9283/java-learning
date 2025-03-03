package PRA;
import java.util.*;

class Orders{
    private int orderId;
    private String orderName;
    private int noOfPRoduct;
    private List<String> products;
    private List<Integer> quantity;

    public Orders(int orderId,String orderName,int noOfPRoduct,List<String> products,List<Integer> quantity)
    {
        this.orderId = orderId;
        this.orderName = orderName;
        this.products = products;
        this.quantity = quantity;
        this.noOfPRoduct = (products != null) ? products.size() : 0;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public int getNoOfProducts() {
        return noOfPRoduct;
    }

    public List<String> getProducts() {
        return products;
    }
    public List<Integer> getQuantities() {
        return quantity;
    }
}

class OrdersService{
    private List<Orders> orderLists;
    public OrdersService(List<Orders> orderLists)
    {
        this.orderLists = orderLists;
    }

    public String getMaximumByQuantity(int orderId)
    {
        for(Orders order:orderLists)
        {
            if(order.getOrderId() == orderId)
            {
                List<String> products = order.getProducts();
                List<Integer> quantity= order.getQuantities();

                if(quantity.isEmpty()) 
                {
                    return "No products found";
                }
                int maxindex = 0;
                for(int i = 1; i < quantity.size(); i++)
                {
                    if(quantity.get(i) > quantity.get(maxindex))
                    {
                        maxindex = i;
                    }
                }
                return products.get(maxindex);
            }
        }
        return "Order ID Not Found";
    }

    public List<Orders> findOrdersByProductName(String productName)
    {
        List<Orders> ans = new ArrayList<>();
        for(Orders order:orderLists)
        {
            if(order.getProducts().contains(productName))
            {
                ans.add(order);
            }
        }
        return ans;
    }
}

public class PRA1R {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int noOforder = sc.nextInt();sc.nextLine();
        List<Orders> orderLists = new ArrayList<>();
        for(int i = 0; i < noOforder; i++)
        {
            int orderId = sc.nextInt();sc.nextLine();
            String orderName =  sc.nextLine();
            int numberOfProduct = sc.nextInt();sc.nextLine();

            List<String> productsList =  new ArrayList<>();
            List<Integer> quantityList= new ArrayList<>();

            for(int j = 0; j < numberOfProduct; j++)
            {
                String productName = sc.nextLine();
                productsList.add(productName);
                int quantity =  sc.nextInt();sc.nextLine();
                quantityList.add(quantity);
            }
            orderLists.add(new Orders(orderId,orderName,numberOfProduct,productsList,quantityList));
        }

        OrdersService service = new OrdersService(orderLists);
        int findbyid = sc.nextInt();sc.nextLine();
        String productName =  sc.nextLine();
        String maximumQuantity = service.getMaximumByQuantity(findbyid);
        System.out.println(maximumQuantity);
        System.out.println("2nd answer=-=-=-");
        List<Orders> listorderByProduct = service.findOrdersByProductName(productName);
        for(Orders o:listorderByProduct)
        {
            System.out.println(o.getOrderId());
            System.out.println(o.getOrderName());
        }
    }
    
}
