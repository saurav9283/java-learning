import java.util.*;

class Phone {
    private int phoneId;
    private String os;
    private String brand;
    private int price;
    public Phone(int phoneId, String os, String brand, int price)
    {
        this.phoneId = phoneId;
        this.os = os;
        this.brand = brand;
        this.price = price;
    }
    public int getphoneId()
    {
        return phoneId;
    }
    public String getos()
    {
        return os;
    }
    public String getbrand()
    {
        return brand;
    }
    public int getprice()
    {
        return price;
    }
}

public class IPA15Solution{

    public static int findPriceForGivenBrand(Phone[] phones, String search)
    {
        int sum = 0;
        for(Phone phone: phones)
        {
            if(phone.getbrand().equalsIgnoreCase(search))
            {
                sum += phone.getprice();
            }
        }
        return sum;
    } 
    public static int getPhoneIdBasedOnOs(Phone[] phones, String find)
    {
        for(Phone phone:phones)
        {
            if(phone.getos().equalsIgnoreCase(find) && phone.getprice() > 50000)
            {
                return phone.getphoneId();
            }
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Phone[] phone = new Phone[4];
        for(int i = 0 ; i < 4; i++)
        {
            int phoneId = sc.nextInt();sc.nextLine();
            String os=  sc.nextLine();
            String brand = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();

            phone[i] = new Phone(phoneId, os, brand, price);
        }

        String searchbybrand = sc.nextLine();
        String findos = sc.nextLine();

        int newphone = findPriceForGivenBrand (phone,searchbybrand);
        if(newphone != 0)
        {
            System.out.println(newphone);
        }
        else{
            System.out.println("The brand is not available");
        }

        int ans = getPhoneIdBasedOnOs(phone, findos);
        if(ans != 0)
        {
            System.out.println(ans);
        }
        else{
            System.out.println("No phones are available with specified os and price range");
        }
        
    }
}