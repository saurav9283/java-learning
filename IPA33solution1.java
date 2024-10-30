import java.util.Scanner;

class newspaper {
    private int regNo;
    private String name;
    private int publicationYear;
    private int price;

    public newspaper(int regNo, String name,  int publicationYear, int price)
    {
        this.regNo= regNo;
        this.name = name;
        this.publicationYear = publicationYear;
        this.price = price;
    }

    public int getid()
    {
        return regNo;
    }
    public void setid(int regNo)
    {
        this.regNo = regNo;
    }
    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name = name;
    }
    public int getpublicationYear()
    {
        return publicationYear;
    }
    public void setpublicationYear()
    {
        this.publicationYear = publicationYear;
    }
    public int getprice()
    {
        return price;
    }
    public void setprice(int price)
    {
        this.price = price;
    }
}

public class IPA33solution1{
    public static int findTotalPriceByPublicationYear(newspaper[] papers, int findYear)
    {
        int sum = 0;
        for(newspaper paper: papers)
        {
            if(paper.getpublicationYear() == findYear)
            {
                sum += paper.getprice();
            }
        }
        return sum;
    }
    public static newspaper searchNewspaperByName(newspaper[] papers, String findName)
    {
        for(newspaper paper: papers)
        {
            if(paper.getname().equalsIgnoreCase(findName))
            {
                return  paper;
            }
        }
        return null;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();sc.nextLine();
        newspaper[] paper=  new newspaper[num1];
        for(int i = 0; i <  num1; i++)
        {
            int regNo = sc.nextInt();sc.nextLine();
            String name = sc.nextLine();
            int publicationYear = sc.nextInt();sc.nextLine();
            int price = sc.nextInt();sc.nextLine();

            paper[i] = new newspaper(regNo,name,publicationYear,price);
        }

        int findYear = sc.nextInt();sc.nextLine();
        String findName = sc.nextLine();
        int ans = findTotalPriceByPublicationYear(paper, findYear);
        if(ans != 0)
        {
            System.out.println(ans);
        }
        else{
            System.out.println("No Newspaper found with the mentioned attribute");
        }
        newspaper result = searchNewspaperByName(paper,findName);
        if(result != null)
        {
            System.out.println("regNo: " + result.getid());
            System.out.println("name: "+ result.getname());
            System.out.println("publicationYear: "+ result.getpublicationYear());
            System.out.println("price: "+ result.getid());
        }
        else{
            System.out.println("No Newspaper found with the mentioned");
        }
        

    }
}