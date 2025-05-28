public class CAmain{
    public static void main(String args[]){
        Accounts ac1 = new Accounts(1234,500.23);
        Accounts ac2 = new Accounts(3456,200.34);
        Accounts ac3 = new Accounts(5678,300.15);
        Accounts ac4 = new Accounts(8901,23.21);

        Customer c = new Customer("Abdur Rahman",017,3);
        c.insertAccount(ac1);
        c.insertAccount(ac2);
        c.insertAccount(ac3);
        c.insertAccount(ac4);
        c.showCustomerInfo();
    }
}