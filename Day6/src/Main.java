public class Main {
    public static void main(String[] args) {

        BankAccount ba1 = new BankAccount(1,"Marshad",5000);
        BankAccount ba2 = new BankAccount(2,"Al-Haj Majeedh mowlavi",100000);
        BankAccount ba3 = new BankAccount(3,"Zeena",50000);

        Bank bank = new Bank();
        bank.addAccount(ba1);
        bank.addAccount(ba2);
        bank.addAccount(ba3);

        bank.deposit(1,7000);
        bank.withdraw(1,10000);
        bank.transferMoney(2,3,5000);

        bank.printAllAccounts();
    }
}
