import java.util.*;

public class Staticins{

    // int x = 10;
    // static int y = 20;

    // void show(){
    //     System.out.println(x);
    //     System.out.println(y);
    // }

    // static void display(){
    //     // System.out.println(x);
    //     System.out.println(y);
    // }

    // public static void main(String[] args){
    //     Staticins demon = new Staticins();

    //     demon.show();
    //     Staticins.display();
    // }


    int a = 10;
        int b = 20;
        
    // void values(){
    //     int a = 10;
    //     int b = 20;
    // }

    public static void main(String[] args){
        Staticins staa = new Staticins();
        // staa.values();

        int add = staa.a + staa.b;
        System.out.println(add);

    }


}