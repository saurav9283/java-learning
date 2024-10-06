class Abstract {
    private int p, q;

    public void SettData(int a, int b) {
        p = a;
        q = b;
    }

    public void Display() {
        System.out.println("Value is " + p);
        System.out.println("Value is " + q);
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Abstract obj = new Abstract();
        obj.SettData(12, 13);
        obj.Display();
    }
}