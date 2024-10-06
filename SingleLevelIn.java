class Animal{
    public void eat(){
        System.out.println("This is eating");
    }
}

class  Dog extends Animal{
    public void bark()
    {
        System.out.println("this is is bark");
    }
}

public class SingleLevelIn{
    public static void main(String[] args)
    {
        Dog d = new Dog();

        d.bark();
        d.eat();
    }
}