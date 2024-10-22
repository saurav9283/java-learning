import java.util.Scanner;

class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int getnumber() {
        return accountNumber;
    }

    public String getaccountHolderName() {
        return accountHolderName;
    }

    public double getbalance() {
        return balance;
    }

    public void setbalance(double newbalance) {
        this.balance = newbalance;
    }
}

public class IPA41Solution {
    public static double withdraw(BankAccount[] accounts, int findaccount, double findmoney) {
        double moneyleft = 0;
        for (BankAccount account : accounts) {
            if (account.getnumber() == findaccount) {
                if (account.getbalance() >= findmoney) {
                    moneyleft = account.getbalance() - findmoney;
                    return moneyleft;
                } else {
                    return -1;
                }
            }
        }
        return -2;
    }

    public static double creadit(BankAccount[] accounts, int searchaccount, double searchmoney)
    {
        double creaditmny = 0;
        for(BankAccount account: accounts)
        {
            if(account.getnumber() == searchaccount)
            {
                creaditmny =  account.getbalance() + searchmoney;
                return creaditmny;
            }
            else{
                return -1;
            }
        }
        return -2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount[] account = new BankAccount[3];
        for (int i = 0; i < 3; i++) {
            int accountNumber = sc.nextInt();
            sc.nextLine();
            String accountHolderName = sc.nextLine();
            double balance = sc.nextDouble();
            sc.nextLine();

            account[i] = new BankAccount(accountNumber, accountHolderName, balance);
        }
        int findaccount = sc.nextInt();
        sc.nextLine();
        double findmoney = sc.nextDouble();
        sc.nextLine();
        int searchaccount = sc.nextInt();
        sc.nextLine();
        double searchmoney = sc.nextDouble();
        sc.nextLine();

        double ans = withdraw(account, findaccount, findmoney);
        if(ans == -1)
        {
            System.out.println("Sorry - Insufficient balance");
        }
        else if(ans == -2)
        {
            System.out.println("Sorry - Account not found");
        }
        else{
            System.out.println(ans);
        }

        double creaditmoney =  creadit(account,searchaccount,searchmoney);
        System.out.println(creaditmoney);
    }
}