public class Accounts{
    private int number;
    private double balance;

    public Accounts(int number, double balance){
        this.number = number;
        this.balance = balance;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }

    public void showInfo(){
        System.out.println("Account Number: " + number);
        System.out.println("Account Balance: " + balance);
    }
}