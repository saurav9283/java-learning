package CRUD;
import java.util.*;

public class Hashset_Crud {
    public static void main(String[] args)
    {
        HashSet<Integer> hashset = new HashSet<>();

        //insert value
        hashset.add(2);
        hashset.add(3);
        hashset.add(5);
        hashset.add(1);
        hashset.add(10);
        System.out.println(hashset);

        //read
        int search = 5;
        if(hashset.contains(hashset))
        {
            System.out.println(search + " exists in the HashSet.");
        }


        //update
        int removeData = 2;
        if(hashset.contains(removeData))
        {
            hashset.remove(2);
            hashset.add(43);
            System.out.println("Updated the value");
        }

        System.out.println(hashset);

        //remove 
        hashset.remove(3);
        System.out.println("HashSet after removing 2: " + hashset);
    }
}
