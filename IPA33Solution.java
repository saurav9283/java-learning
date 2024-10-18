import java.util.*;

class newspaper{
    private int regNo;
    private String name;
    private int publicationYear;
    private int price;

    public newspaper(int regNo, String name, int publicationYear, int price)
    {
        this.regNo = regNo;
        this.name = name;
        this.publicationYear = publicationYear;
        this.price = price;
    }
    public int getid()
    {
        return regNo;
    }
    public String getName()
    {
        return name;
    }
    public int getpublicationYear()
    {
        return publicationYear;
    }
    public int getprice()
    {
        return price;
    }
}

public class IPA33Solution{
    public static int findTotalPriceByPublicationYear(newspaper[] papers, int find)
    {
        int sum = 0;
        for(newspaper paper: papers)
        {
            if(paper.getpublicationYear() == find){
                sum += paper.getprice();
            }
        }
        return sum;
    }
    public static newspaper searchNewspaperByName(newspaper[] papers, String findstring)
    {
        for(newspaper paper: papers)
        {
            if(paper.getName().equalsIgnoreCase(findstring))
            {
                return paper;
            }
        }
        return null;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();sc.nextLine();
        newspaper[] paper = new newspaper[num1];
        for(int i = 0; i < num1; i++)
        {
            int regNo =  sc.nextInt();sc.nextLine();
            String name = sc.nextLine();
            int publicationYear =  sc.nextInt();sc.nextLine();
            int price = sc.nextInt();sc.nextLine();

            paper[i] = new newspaper(regNo, name, publicationYear, price);
        }

        int find = sc.nextInt();sc.nextLine();
        String findstring = sc.nextLine();
        int ans =  findTotalPriceByPublicationYear(paper,find);
        if(ans != 0)
        {
            System.out.println(ans);
        }
        else{
            System.out.println("No Newspaper found with the mentioned attribute");
        }
        newspaper newlist =  searchNewspaperByName(paper, findstring);
        if(newlist != null)
        {
            System.out.println("regNo-"+newlist.getid());
            System.out.println("name-"+newlist.getName());
            System.out.println("publicationYear-"+newlist.getpublicationYear());
            System.out.println("price-"+newlist.getprice());
        }
        else{
            System.out.println("No Newspaper found with the given name");
        }

    }
}