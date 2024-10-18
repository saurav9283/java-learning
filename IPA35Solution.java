import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Car{
    private int carId;
    private String carName;
    private String fuelType;

    public Car(int carId,String carName, String fuelType)
    {
        this.carId = carId;
        this.carName = carName;
        this.fuelType = fuelType;
    }
    public int getid()
    {
        return carId;
    }
    public String getname()
    {
        return carName;
    }
    public String getfuelType()
    {
        return fuelType;
    }
}

public class IPA35Solution{
    public static List<Car> RemoveAndRearrange(Car[] cars, int findid)
    {
        List<Car> list =  new ArrayList<>();
        for(Car car: cars)
        {
            if(car.getid() != findid)
            {
                list.add(car);
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
        int num1 = sc.nextInt();
        sc.nextLine();
        Car[] car = new Car[num1];
        for(int i = 0; i < num1; i++)
        {
            int carId =  sc.nextInt();sc.nextLine();
            String carName =sc.nextLine();
            String fuelType = sc.nextLine();

            car[i] = new Car(carId, carName,fuelType);
        }

        int findid = sc.nextInt();sc.nextLine();

        List<Car> newlist = RemoveAndRearrange(car , findid);
        if(newlist != null)
        {
            for(Car c: newlist)
            {
                System.out.println(c.getid() + " : " +c.getname());
            }
        }
        else{
            System.out.println("There are no car with given id");
        }

    }
}