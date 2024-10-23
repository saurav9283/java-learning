import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

class Bill{
    private int billNo;
    private String name;
    private String typeOfConnection;
    private double billAmount;
    private boolean status;

    public Bill(int billNo, String name, String typeOfConnection, double billAmount,boolean status)
    {
        this.billNo= billNo;
        this.name = name;
        this.typeOfConnection = typeOfConnection;
        this.billAmount = billAmount;
        this.status = status;
    }
    public int getbillno()
    {
        return billNo;
    }
    public String getname()
    {
        return name;
    }
    public String gettypeOfConnection()
    {
        return typeOfConnection;
    }
    public double getbillAmounnt()
    {
        return billAmount;
    }
    public boolean getstatus()
    {
        return status;
    }
}

public class IPA49Solution{
    public static Bill findBillWithMaxBillAmountBasedOnStatus(Bill[] bills, boolean find)
    {
        List<Bill> list = new ArrayList<>();
        for(Bill bill: bills)
        {
            if(bill.getstatus() == find)
            {
                list.add(bill);
            }
        }
        list.sort(Comparator.comparingDouble(Bill::getbillAmounnt));
        if(list.isEmpty()){
            return null;
        }
        else{
            return list.get(list.size()-1);
        }
    }
    public static int getCountWithTypeOfConnection(Bill[] bills, String search)
    {
        int ans = 0;
        for(Bill bill: bills)
        {
            if(bill.gettypeOfConnection().equalsIgnoreCase(search))
            {
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Bill[] bill = new Bill[4];
        for(int i = 0; i < 4; i++)
        {
            int billNo = sc.nextInt();sc.nextLine();
            String name = sc.nextLine();
            String typeOfConnection = sc.nextLine();
            double billAmount =  sc.nextDouble(); sc.nextLine();
            boolean status =  sc.nextBoolean();sc.nextLine();

            bill[i] = new Bill(billNo, name, typeOfConnection, billAmount, status);
        }

        boolean findbool = sc.nextBoolean();sc.nextLine();
        String search = sc.nextLine();

        Bill ans = findBillWithMaxBillAmountBasedOnStatus(bill,findbool);
        if(ans != null)
        {
            System.out.println(ans.getbillno()+"#"+ans.getname());
        }
        else{
            System.out.println("There are no bill with the given status");
        }

        int count =  getCountWithTypeOfConnection(bill, search);
        if( count !=0)
        {
            System.out.println(count);
        }
        else{
            System.out.println("There are no bills with given type of connection");
        }
    }
}