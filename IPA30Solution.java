import java.util.*;

class Document{
    private int id;
    private String title;
    private String folderName;
    private int pages;

    public Document(int id, String title, String folderName, int pages)
    {
        this.id = id;
        this.title = title;
        this.folderName = folderName;
        this.pages = pages;
    }
    public int getid()
    {
        return id;
    }
    public String gettitle()
    {
        return title;
    }
    public String getfolderName()
    {
        return folderName;
    }
    public int getpages()
    {
        return pages;
    }
}

public class IPA30Solution{
    public static List<Document> docsWithOddPages(Document[] documents)
    {
        List<Document> list = new ArrayList<>();
        for(Document document: documents)
        {
            if(document.getpages() % 2 != 0)
            {
                list.add(document);
            }
        }
        if(list.isEmpty())
        {
            return null;
        }
        else{
            return list;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int nums1 =  sc.nextInt();
        sc.nextLine();
        Document[] document = new Document[nums1];
        for(int i = 0 ; i < nums1; i++)
        {
            int id = sc.nextInt();sc.nextLine();
            String title = sc.nextLine();
            String folderName = sc.nextLine();
            int pages =  sc.nextInt();sc.nextLine();

            document[i] = new Document(id, title, folderName, pages);
        }

        List<Document> newlist = docsWithOddPages(document);
        if(newlist != null)
        {
            for(Document d: newlist)
            {
                System.out.println(d.getid()+" "+d.gettitle()+" "+d.getfolderName()+" "+d.getpages());
            }
        }
        else{System.out.println("null");}
    }
}