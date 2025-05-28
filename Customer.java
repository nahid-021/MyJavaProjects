public class Customer{
    private String name;
    private int phone;
    private Accounts ac[];

    public Customer(String name, int phone, int sizeofarray){
        this.name = name;
        this.phone = phone;
        ac = new Accounts[sizeofarray];
    }
    public void insertAccount(Accounts aacc){
        for(int i=0; i<ac.length; i++){
            if(ac[i] == null){
                ac[i] = aacc;
                break;
            }
        }
    }
    public void deleteAccount(int number){
        for(int i=0; i<ac.length; i++){
            if(ac[i].getNumber() == number){
                ac[i] = null;
            }
        }
    }
    public void showCustomerInfo(){
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Phone: " + phone);
        for(int i=0; i<ac.length; i++){
            if(ac[i] != null){
                System.out.println("Account Info: " + (i+1));
                ac[i].showInfo();
            }
        }
    }
}