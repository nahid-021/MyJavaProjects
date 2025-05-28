/* Modify the BankAccount class to include a deposit(amount) and withdraw(amount) method that updates the balance. 
Ensure withdrawal doesn’t go below 0. */
import java.util.Scanner;
class BankAccount {
    private int accountNumber;
    private int balance;
    public void setNumber(int num) {
        this.accountNumber = num;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getNumber() {
        return accountNumber;
    }
    public int getBalance() {
        return balance;
    }
    void displayInfo() {
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }
    void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much you want to depoisit: ");
        int n = sc.nextInt();
        balance += n;
        System.out.println("After deposit: " + balance);
    }
    void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much you want to withdraw: ");
        int n = sc.nextInt();
        if(n<=balance) {
            balance -= n;
            System.out.println("After witdraw: " + balance);
        }
        else {
            System.out.println("You don't have enough money.");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount member = new BankAccount();
        member.setNumber(1234);
        member.setBalance(50000);
        member.displayInfo();
        member.deposit();
        member.withdraw();
    }
}