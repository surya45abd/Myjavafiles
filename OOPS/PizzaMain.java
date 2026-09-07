import java.util.*;

class Order{
    int orderid;
    int price;

    Order(int orderid ,int price){
        this.orderid = orderid;
        this.price = price;
    }

    void display(){
        System.out.println(orderid + " " + price);
    }
}

class Pizzaorder extends Order{
    Pizzaorder(int orderid,int price){
        super(orderid,price);
    }
}

public class PizzaMain{
    public static void main(String[] args){
        Pizzaorder p = new Pizzaorder(1,200);
        p.display();
    }
}