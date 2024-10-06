class Captual{
    private int x;

    public void setValue(int a)
    {
        x = a;
    }
    public int getValue()
    {
        return x;
    }

}

public class Encapsulation{
    public static void main(String[] args)
    {
        Captual obj1 = new Captual();
        obj1.setValue(13);
        System.out.println(obj1.getValue());


    }
}