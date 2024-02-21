public class CreditUser {
    public static void main(String[] args) {
        CreditCard Efraim = new CreditCard("Efraim", "BCA", "190335103", 4000, 1000);
        System.out.println("Customer: " + Efraim.getCustomer());
        System.out.println("Bank: " + Efraim.getBank());
        System.out.println("Account: " + Efraim.getAccount());
        System.out.println("Credit Limit: " + Efraim.getLimit());
        System.out.println("Balance: $" + Efraim.getBalance());

        Efraim.charge(100);

        Efraim.makePayment(300);

        System.out.println("Updated balance: $" + Efraim.getBalance());
    }
}

class CreditCard {
    String customer;
    String bank;
    String account;
    int limit;
    double balance;

    public CreditCard(String customer, String bank, String account, int limit, double balance) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = balance;
    }
    
    public String getCustomer() {
        return this.customer;
    }
    public String getBank() {
        return this.bank;
    }

    public String getAccount() {
        return this.account;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getLimit() {
        return this.limit;
    }

    public boolean charge(double price) {
        if (price <= 0) {
            System.out.println("Invalid price. Price must be greater than zero.");
            return false;
        }
        
        if (price + balance > limit) {
            System.out.println("Transaction declined. Exceeds credit limit.");
            return false;
        }
        
        balance += price;
        return true;
    }

    public void makePayment(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid payment amount. Amount must be greater than zero.");
            return;
        }
        
        balance -= amount;
        System.out.println("Payment of $" + amount + " made successfully.");
    }


}