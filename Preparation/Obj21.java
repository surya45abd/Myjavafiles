import java.util.*;

public class Obj21{

    String car;
    String colour ;
    int no = 323;

    void show(){
        System.out.println(car);
        System.out.println(colour);
        System.out.println(no);
    }
     void show(int no){
        System.out.println(car);
        System.out.println(colour);
        System.out.println(no);
    }

    public static void main(String[] args){
        System.out.println("!!!! START !!!!");
        Obj21 a1 = new Obj21();
        Obj21 a2 = new Obj21();
        Obj21 a3 = new Obj21();
        Obj21 a4 = new Obj21();
        Obj21 a5 = new Obj21();

        a1.car = "bmw";
        a1.colour = "black";
        a1.show();

        a2.car = "benz";
        a2.colour = "white";
        a2.show();

        a3.car = "suzuki";
        a3.colour = "red";
        a3.show(07);

        a4.car = "lenova";
        a4.colour = "green";
        a4.show(18);

        a5.car = "range rover";
        a5.colour = "gray";
        a5.show(45);

        System.out.println("!!!!  END !!!!");
    }
}