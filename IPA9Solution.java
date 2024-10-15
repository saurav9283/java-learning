import java.util.*;

class Book{
    private int id;
    private int pages;
    private String title;
    private String author;
    private double price;

    public Book(int id, int pages, String title, String author, double price)
    {
        this.id = id;
        this.pages = pages;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public int getid()
    {
        return id;
    }
    public int getpages()
    {
        return pages;
    }
    public String gettitle()
    {
        return title;
    }
    public String getauthor()
    {
        return author;
    }
    public double getprice()
    {
        return price;
    }
}

public class IPA9Solution{

    public static List<Book> findBookWithMaximumPrice(Book[] books)
    {
        List<Book> list = new ArrayList<>();
        double maxprice = 0; 
        for(Book book : books)
        {
            if(book.getprice() > maxprice)
            {
                maxprice = book.getprice();
            }
        }

        for(Book book :books)
        {
            if(book.getprice() == maxprice)
            {
                list.add(book);
            }
        }

        return list;
    }

    public static List<Book> searchBookByTitle(Book[] books, String search)
    {
        List<Book> list = new ArrayList<>();
        for(Book book:books)
        {
            if(book.gettitle().equalsIgnoreCase(search))
            {
                list.add(book);
            }
        }
        return list;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Book[] book = new Book[4];
        for(int i= 0;i <  4; i++)
        {
            int id = sc.nextInt();sc.nextLine();
            int pages = sc.nextInt();sc.nextLine();
            String title = sc.nextLine();
            String author = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();

            book[i] = new Book(id, pages, title,author, price);
        }
        List<Book> newbook = findBookWithMaximumPrice(book);
        if(!newbook.isEmpty())
        {
            for(Book mbook:newbook)
            {
                System.out.println(mbook.getid() +" " + mbook.gettitle());
            }
        }
        else{
            System.out.println("null");
        }

        String search = sc.nextLine();
        List<Book> searchBook = searchBookByTitle (book , search);
        if(!searchBook.isEmpty())
        {
            for(Book cbook : searchBook)
            {
                System.out.println(cbook.getid());
                System.out.println(cbook.getpages());
            }
        }
    }
}