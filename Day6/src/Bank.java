import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public BankAccount getAccount(int id,int index) {

        if (index < 0) {
            return null;
        }

        if (accounts.get(index).getId() == id) {
            return accounts.get(index);
        }

        return getAccount(id,index - 1);
    }

    public void printAllAccounts() {
        System.out.println("\n----- Account Details -----");
        for (BankAccount account : accounts) {
            account.printAccountDetails();
        }
        System.out.println("==========================");
    }

    public void deposit(int id,int amount) {

        BankAccount account = getAccount(id,accounts.size()-1);
        if (account != null) {
            account.deposit(amount);
        }
    }

    public void withdraw(int id,int amount) {

        BankAccount account = getAccount(id,accounts.size()-1);
        if (account != null) {
            account.withdraw(amount);
        }
    }

    public void transferMoney(int fromID,int toID,int amount) {

        BankAccount fromAccount = getAccount(fromID,accounts.size() - 1);
        BankAccount toAccount = getAccount(toID,accounts.size() - 1);

        if (fromAccount == null || toAccount == null) {
            System.out.println ("Error: FromID account OR ToID Account not found");
            return;
        }

        if (fromAccount.getBalance() < amount) {
            System.out.println ("Error: FromID account balance is low to transfer money");
            return;
        }

        if (fromAccount.getBalance() >= amount) {

            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
        }
    }
}
