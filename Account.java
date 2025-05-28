public class Account{
private String accName;
private int accId;
private float accBalance;
public Account(){
System.out.println("Empty cont");
}
public Account(String name , int num , float bala){
accName=name;
accId=num;
accBalance=bala;
}
public Account( int num , float bala){
accId=num;
accBalance=bala;
}
public void set_accName(String name ){
accName=name;
}
public String get_accName(){
return accName;
}
public void set_accId(int num){
accId=num;
}
public int get_accId(){
return accId;
}
public void set_accBalance(float bala){
accBalance=bala;
}
public float get_accBalance(){
return accBalance;
}
public void showInfo(){
//System.out.println("Customer name : "+ accName);
System.out.println("Customer Number : "+ accId);
System.out.println("Customer Balance : "+ accBalance);
}
}