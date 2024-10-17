import java.util.*;

class Engine{
    private int engineld;
    private String engineName;
    private String engine_Type;
    private double enginePrice;

    public Engine(int engineld, String engineName, String engine_Type,double enginePrice)
    {
        this.engineld = engineld;
        this.engineName = engineName;
        this.engine_Type = engine_Type;
        this.enginePrice = enginePrice;
    }

    public int getId()
    {
        return engineld;
    }
    public String getengineName()
    {
        return engineName;
    }
    public String getengine_Type()
    {
        return engine_Type;
    }
    public double getenginePrice()
    {
        return enginePrice;
    }
}

public class IPA20Solution{
    public static int findAvgEnginePriceByType(Engine[] engines, String search)
    {
        int sum = 0;
        int count = 0;
        for(Engine engine:engines)
        {
            if(engine.getengine_Type().equalsIgnoreCase(search))
            {
                sum += engine.getenginePrice();
                count++;
            }
        }
        if(count > 0)
        {
            int avg = sum/count;
            return avg;
        }
        else{
            return 0;
        }
    }
    public static List<Engine> searchEngineByName(Engine[] engines, String find)
    {
        List<Engine> list = new ArrayList<>();
        for(Engine engine: engines)
        {
            if(engine.getengineName().equalsIgnoreCase(find))
            {
                list.add(engine);
            }
        }
        list.sort(Comparator.comparingInt(Engine::getId));
        return list;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Engine[] engine = new Engine[4];
        for(int i = 0;i < 4;i++)
        {
            int  engineld = sc.nextInt();sc.nextLine();
            String engineName = sc.nextLine();
            String engine_Type =  sc.nextLine();
            double enginePrice = sc.nextDouble();sc.nextLine();
            engine[i] = new Engine(engineld, engineName, engine_Type, enginePrice);
        }

        String search = sc.nextLine();
        String find = sc.nextLine();

        int ans  = findAvgEnginePriceByType(engine, search);
        if(ans != 0)
        {
            System.out.println(ans);
        }
        else{
            System.out.println("There are no engine with given type");
        }

        List<Engine> newans = searchEngineByName(engine , find);
        if(!newans.isEmpty())
        {
            for(Engine e: newans)
            {
                System.out.println(e.getenginePrice());
            }
        }
        else{
            System.out.println("There are no engine with the given name");
        }

    }
}