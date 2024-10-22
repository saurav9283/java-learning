import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

class Car{
    private String make;
    private String model;
    private int year;
    private double price;

    public Car(String make, String model, int year, double price)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    public String getmake()
    {
        return make;
    }
    public String getmodedl()
    {
        return model;
    }
    public int getyear()
    {
        return year;
    }
    public double getprice()
    {
        return price;
    }
}

public class IPA40Solution{
    public static Car findMostExpensiveCar(Car[] cars)
    {
        List<Car> list = new ArrayList<>();
        for(Car car: cars)
        {
            list.add(car);
        }
        if(list.isEmpty())
        {
            return null;
        }
        list.sort(Comparator.comparingDouble(Car::getprice));
        return list.get(list.size()-1);

    }

    public static Car getCarByMakeAndModel(Car[] cars, String find, String findone)
    {
        for(Car car:cars)
        {
            if(car.getmake().equalsIgnoreCase(find) && car.getmodedl().equalsIgnoreCase(findone))
            {
                return car;
            }
        }
        return null;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Car[] car = new Car[4];
        for(int i = 0; i < 4; i++)
        {
            String make = sc.nextLine();
            String model = sc.nextLine();
            int year = sc.nextInt();sc.nextLine();
            int price = sc.nextInt();sc.nextLine();

            car[i] = new Car(make, model, year, price);
        }

        String find = sc.nextLine();
        String findone = sc.nextLine();

        Car newcar = findMostExpensiveCar(car);
        if(newcar  != null)
        {
            System.out.println(newcar.getmake());
            System.out.println(newcar.getmodedl());
            System.out.println(newcar.getprice());
            System.out.println(newcar.getyear());
        }
        else{
            System.out.println("Sorry - No car is available");
        }

        Car carlist =  getCarByMakeAndModel(car,find,findone);
        if(carlist != null)
        {
            System.out.println(carlist.getyear());
            System.out.println(carlist.getprice());
        }
        else{
            System.out.println("Sorry - No car is available");
        }
    }
}