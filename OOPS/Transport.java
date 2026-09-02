import java.util.*;

class Car{
    void display(){
        System.out.println("car : ");
    }
}

class Bus extends Car{
    void shoplay(){
        System.out.println("bus  : ");
        
    }
}

public class Transport extends Bus{
    public static void main(String[] args){
        Transport t  = new Transport();
        t.display();
        t.shoplay();
    }
}