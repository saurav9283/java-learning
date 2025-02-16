package PRA;
import java.util.*;

class Accociates
{
    private int id;
    private String name;
    private String tech;
    private int exp;

    public Accociates(int id, String name, String tech,int exp)
    {
        this.id = id;
        this.name = name;
        this.tech = tech;
        this.exp = exp;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public String getTech()
    {
        return tech;
    }
    public int getExp()
    {
        return exp;
    }
}

public class PRA22{
    public static List<Accociates> associatesForGivenTechnology(Accociates[] accociates , String search)
    {
        List<Accociates> list = new ArrayList<>();
        for(Accociates accociate:accociates)
        {
            if(accociate.getTech().equalsIgnoreCase(search) && accociate.getExp()%5 == 0)
            {
                list.add(accociate);
            }
        }
        list.sort(Comparator.comparingInt(Accociates::getId));
        return list;
    }
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        Accociates[] accociate = new Accociates[5];
        for(int i = 0; i <  5; i++)
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            accociate[i] = new Accociates(a,b,c,d);
        }
        String search = sc.nextLine();

        List<Accociates> newList = associatesForGivenTechnology(accociate, search);
        if(!newList.isEmpty()){
            for(Accociates acco: newList)
            {
                System.out.println(acco.getId());
            }
        }
    }
}