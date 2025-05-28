public class Start{
public static void main(String args[]){
//Account a1 = new Account();
//a1.showInfo();
Account a2 =new Account(null , 12345 , 10000);
//a2.showInfo();
Customer ac1=new Customer(a2,"Taqi",989098);
ac1.show_customer();
Account acc1 =new Account(9857,5000);
Customer cus1=new Customer(acc1,"Nishat", 017230);
cus1.show_customer();
//Account a3 =new Account();
//a3.set_accName("Fahmi");
//a3.set_accId(54321);
//a3.set_accBalance(20000);
//a3.showInfo();
}
}