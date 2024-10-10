package ILP;
import java.util.*;

class College{
    private int id;
    private String name;
    private int contactNo;
    private String address;
    private int pincode;

    public College( int id , String name, int contactNo, String address, int pincode){
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.address = address;
        this.pincode =pincode;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name = name;
    }
    public int getcontactNo()
    {
        return contactNo;
    }
    public void setcontactNo(int contactNo)
    {
        this.contactNo = contactNo;
    }
    public String getaddress()
    {
        return address;
    }
    public void setaddress(String address)
    {
        this.address = address;
    }
    public int getpincode()
    {
        return pincode;
    }
    public void setpincode(int pincode)
    {
        this.pincode = pincode;
    }
}

public class Ilp4{
    public static College findCollegeWithMaximumPincode(College[] c)
    {
        int maxi = Integer.MIN_VALUE;
        College maxcollage = null;
        for(College college:c)
        {
            if(college.getpincode() > maxi)
            {
                maxi = college.getpincode();
                maxcollage = college;
            }
        }
        return maxcollage;
    }

    public static College searchCollegeByAddress(College[] c, String search)
    {
        College result = null;
        for(College college: c)
        {
            if(college.getaddress().equals(search))
            {
                result = college;
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of colages ");
        int num = sc.nextInt();sc.nextLine();
        College[] collage = new College[num];
        for(int i = 0; i < num; i++)
        {
            System.out.println("Enter collage detail for " +(i+1));
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            String d = sc.nextLine();
            int e = sc.nextInt();sc.nextLine();

            collage[i] = new College(a, b, c, d, e);
        }
        System.out.println("Enter state to find collage ");
        String search = sc.nextLine();

        College cop = findCollegeWithMaximumPincode(collage);
        if(cop != null)
        {
            System.out.println("ID " +cop.getId());
            System.out.println("name " + cop.getname());
            System.out.println("contact " + cop.getcontactNo());
            System.out.println("address " + cop.getaddress());
            System.out.println("pincode " + cop.getpincode());
        }
        else{
            System.out.println("null");
        }

        College sameaddress = searchCollegeByAddress(collage , search);
        if(cop != null)
        {
            System.out.println("ID " +sameaddress.getId());
            System.out.println("name " + sameaddress.getname());
            System.out.println("contact " + sameaddress.getcontactNo());
            System.out.println("address " + sameaddress.getaddress());
            System.out.println("pincode " + sameaddress.getpincode());
        }
        else{
            System.out.println("null");
        }



    }
}