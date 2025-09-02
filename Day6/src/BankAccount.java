public class BankAccount {
    private int id;
    private String accHolderName;
    private double balance;

    public BankAccount(int id, String accHolderName, double balance) {
        this.id = id;
        this.accHolderName = accHolderName;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println ("\n$New account balance is : "+balance);
    }

    public void withdraw(double amount) {

        if (balance >= amount ) {
            balance -= amount;
            System.out.println ("\n$New current balance is : "+balance);
        } else {
            System.out.println ("\n$Insufficient balance : ");
            System.out.println(balance);
        }

    }

    public void printAccountDetails() {
        System.out.println("\n1) Account ID: " + id);
        System.out.println("2) Account Holder Name: " + accHolderName);
        System.out.println("3) Balance: " + balance);
    }

}
