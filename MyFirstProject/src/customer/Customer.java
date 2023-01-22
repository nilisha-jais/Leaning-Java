package customer;

public class Customer {
    public int id;
    public String name;
    public String address;
    public String mobileNo;
    public String type;
    public void greet(){
        System.out.println("Hey "+name+"! Hope you are fine.");
    }
    public void details(){
        System.out.println("Name:"+name+"\nAddress:"+address+"\nMobile Number:"+mobileNo+"\nSubscription Type:"+type);
    }
}
