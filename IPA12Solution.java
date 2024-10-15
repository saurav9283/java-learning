import java.util.*;

class Medicine{
    private String MedicineName;
    private String batch;
    private String disease;
    private int price;

    public Medicine(String MedicineName, String batch, String disease, int price)
    {
        this.MedicineName = MedicineName;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }
    public String getMedicineName()
    {
        return MedicineName;
    }
    public String getbatch()
    {
        return batch;
    }
    public String getdisease()
    {
        return disease;
    }
    public int getprice()
    {
        return price;
    }
}

public class IPA12Solution{
    public static List<Medicine> getPriceByDisease(Medicine[] medicines, String find)
    {
        List<Medicine> list = new ArrayList<>();
        for(Medicine medicine: medicines)
        {
            if(medicine.getdisease().equalsIgnoreCase(find))
            {
                list.add(medicine);
            }
        }
        return list;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Medicine[] medicle = new Medicine[4];
        for(int i = 0; i < 4; i++)
        {
            String MedicineName = sc.nextLine();
            String batch = sc.nextLine();
            String disease =  sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();

            medicle[i] = new Medicine(MedicineName, batch, disease, price);
        }
        String find = sc.nextLine();
        List<Medicine> newlist = getPriceByDisease(medicle,find);
        if(!newlist.isEmpty())
        {
            for(Medicine xyz: newlist)
            {
                System.out.println(xyz.getprice());
            }
        }
    }
}