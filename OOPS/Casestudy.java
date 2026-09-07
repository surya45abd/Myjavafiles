import java.util.*;

class Employee{
    void display(){
        System.out.println("working");
    }
}
 
class Doctor extends Employee{
    void display(){
        System.out.println("doctor working");
    }
}

class Nurse extends Employee{
    void display(){
        System.out.println("nurse working");
    }
}

class Recep extends Employee{
    void display(){
        System.out.println("recep working");
    }
}

public class Casestudy {
    public static void main(String[] args){
        Employee e = new Employee();
        Employee d = new Doctor();
        Employee n = new Nurse();
        Employee r = new Recep();

        e.display();
        d.display();
        n.display();
        r.display();
    }
}