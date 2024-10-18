import java.util.*;

class Account{
    private int id;
    private double balance;
    private  double interestRate;

    public Account(int id, double balance, double interestRate)
    {
        this.id = id;
        this.balance = balance;
        this.interestRate = interestRate;
    }
    public int getid()
    {
        return id;
    }
    public double getbalance()
    {
        return balance;
    }
    public double getinterestRate()
    {
        return interestRate;
    }
}

public class IPA29Solution{
    public static double calculateintrest(Account ac, int n)
    {
        double per = (ac.getinterestRate()*100)/n;
        per = ac.getinterestRate() + per;
        return per;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();sc.nextLine();
        double balance = sc.nextDouble();sc.nextLine();
        double interestRate =  sc.nextDouble();sc.nextLine();

        Account ac = new Account(id, balance, interestRate);

        int n = sc.nextInt();sc.nextLine();
        double intrest = calculateintrest(ac, n);
        System.out.format("%.3f",intrest);
    }
}