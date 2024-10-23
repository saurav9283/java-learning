import java.util.*;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getaccountNumber() {
        return accountNumber;
    }

    public String getaccountHolderName() {
        return accountHolderName;
    }

    public double getbalance() {
        return balance;
    }
}

class BankUtils {
    BankAccount fromAccount;
    BankAccount toAccount;
    double amount;
    String transactionCode;

    public BankUtils(BankAccount fromAccount, BankAccount toAccount, double amount, String transactionCode) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.transactionCode = transactionCode;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }
}

class Transaction {
    private String transactionCode;
    private double amount;
    private String timestamp;

    public Transaction(String transactionCode, double amount, String timeString) {
        this.transactionCode = transactionCode;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    public String gettransactionCode() {
        return transactionCode;
    }

    public double getamount() {
        return amount;
    }

    public String gettimestamp() {
        return timestamp;
    }
}

public class IPA50Solution {
    public static double[] transferFunds(BankUtils b) {
        if (b.fromAccount.getbalance() > b.getAmount()) {
            double amount1 = b.fromAccount.getbalance() - b.getAmount();
            double amount2 = b.toAccount.getbalance() + b.getAmount();
            double[] amount = { amount1, amount2 };
            return amount;
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount[] ac = new BankAccount[2];
        for (int i = 0; i < ac.length; i++) {
            System.out.println("Account " + (i + 1) + ":");
            System.out.print("Account Number: ");
            String a = sc.nextLine();
            System.out.print("Account Holder Name: ");
            String b = sc.nextLine();
            System.out.print("Balance: ");
            double c = sc.nextDouble();
            sc.nextLine();
            ac[i] = new BankAccount(a, b, c);
            System.out.println();
        }
        System.out.println("Transfer Details:");
        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        sc.nextLine();
        System.out.print("Transaction Code: ");
        String tran = sc.nextLine();
        System.out.println();
        BankUtils bu = new BankUtils(ac[0], ac[1], amount, tran);
        System.out.println("Before Transfer:");
        for (int i = 0; i < ac.length; i++) {
            System.out.println("Account " + (i + 1) + ": " + ac[i].getaccountHolderName() + " - "
                    + ac[i].getaccountNumber() + " - " + ac[i].getbalance());
        }
        double[] ans = transferFunds(bu);

    }
}