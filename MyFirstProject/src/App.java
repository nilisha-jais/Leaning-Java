import java.util.Scanner;

import customer.Customer;
import product.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        Customer c1=new Customer();
        System.out.println("Enter your id:");
        c1.id=scn.nextInt();
        System.out.println("Enter your name:");
        c1.name=scn.next();
        c1.greet();
        System.out.println("Enter your address:");
        c1.address=scn.next();
        System.out.println("Enter your Mobile Number:");
        c1.mobileNo=scn.next();
        System.out.println("Enter your subscription type:");
        c1.type=scn.next();
        c1.details();

        System.out.println("\n\n");

        Product p1=new Product();
        System.out.println("Enter your product id:");
        p1.productId=scn.nextInt();
        System.out.println("Enter your product category:");
        p1.productCategory=scn.next();
        System.out.println("Enter the seller seller:");
        p1.seller=scn.next();
        System.out.println("Enter the color of the product:");
        p1.color=scn.next();
        System.out.println("Enter the price:");
        p1.price=scn.nextLong();
        System.out.println("Enter the features:");
        p1.feature=scn.next();
        p1.productDetails();
        p1.displayFeatures();
    }
}

