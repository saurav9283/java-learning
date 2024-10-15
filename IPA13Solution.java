import java.util.*;

class AutonomousCar {
    private int carld;
    private String brand;
    private int noOfTestsConducted ;
    private int noOfTestsPassed;
    private String environment;
    private String grade;
    public AutonomousCar(int carld,String brand, int noOfTestsConducted,int noOfTestsPassed,String environment)
    {
        this.carld = carld;
        this.brand = brand;
        this.noOfTestsConducted = noOfTestsConducted;
        this.noOfTestsPassed = noOfTestsPassed;
        this.environment = environment;
    }
    public int getid()
    {
        return carld;
    }
    public String getbrand()
    {
        return brand;
    }
    public int getnoOfTestsConducted()
    {
        return noOfTestsConducted;
    }
    public int getnoOfTestsPassed()
    {
        return noOfTestsPassed;
    }
    public String getenvironment()
    {
        return environment;
    }
    public void setgrade(String grade)
    {
        this.grade = grade;
    }
    public String getgrade()
    {
        return grade;
    }
}

public  class IPA13Solution{

    public static int findTestPassedByEnv(AutonomousCar[] cars , String find)
    {
        int sum = 0;
        for(AutonomousCar car:cars)
        {
            if(car.getenvironment().equalsIgnoreCase(find))
            {
                sum += car.getnoOfTestsPassed();
            }
        }
        return sum;
    }

    public static AutonomousCar updateCarGrade(AutonomousCar[] cars,String search)
    {
        List<AutonomousCar> list = new ArrayList<>();
        int rating = 0;
        for(AutonomousCar car:cars)
        {
            if(car.getbrand().equalsIgnoreCase(search))
            {
                rating = (car.getnoOfTestsPassed()*100)/car.getnoOfTestsConducted();
                if(rating >= 80)
                {
                    System.out.println(car.getbrand()+"::A1");
                }
                else{
                    System.out.println(car.getbrand()+"::B2");
                }
                return car;
            }
        }
        return null;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        AutonomousCar[] car = new AutonomousCar[4];
        for(int i = 0; i < 4; i++)
        {
            int carld= sc.nextInt();sc.nextLine();
            String brand = sc.nextLine();
            int noOfTestsConducted  = sc.nextInt();sc.nextLine();
            int noOfTestsPassed = sc.nextInt();sc.nextLine();
            String environment = sc.nextLine();

            car[i] = new AutonomousCar(carld,brand,noOfTestsConducted,noOfTestsPassed,environment);
        }
        String find = sc.nextLine();
        String search = sc.nextLine();

        int ans = findTestPassedByEnv(car,find);
        if(ans > 0)
        {
            System.out.println(ans);
        }
        else{
            System.out.println("No tested");
        }

        AutonomousCar newcar = updateCarGrade(car,search);
        if (newcar != null) {
            System.out.println(search + "::" + newcar.getgrade());
        } else {
            System.out.println("No car found with brand " + search);
        }
    }
}