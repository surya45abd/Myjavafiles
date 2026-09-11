import java.util.*;

public class Cloths implements Product{
    
    public void productDiscount(){
        System.out.println("hello");
    }
    public static void main(String[] args){
        Cloths c = new Cloths();
        Product p = new Cloths();
        c.productDiscount();
        p.productDetails();
    }
}