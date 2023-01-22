package product;

public class Product {
    public int productId;
    public String productCategory;
    public String seller;
    public String color;
    public long price;
    public String feature;
    public void productDetails(){
        System.out.println("Product Id:"+id+"\nProduct Category:"+productCategory+"\nProduct Seller:"+seller+"\nProduct Price:"+price+"\nProduct Color:"+color)
    }
    public void displayFeatures(){
        System.out.println(productCategory+":"+feature);
    }
}
