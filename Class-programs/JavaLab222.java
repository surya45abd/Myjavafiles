import java.util.*;

public class JavaLab222{

    int year ;
    String name;
    String brand;

    JavaLab222(){
        year = 2002;
        name = "bmw_car";
        brand = "bmw";
    }
    JavaLab222(int year){
        this.year = year;
        name = "bmw_car";
    }
    JavaLab222(int year,String name){
       this.year = year;
        this.name = name;
        brand = "bmw";
    }
    void show(){
        System.out.println(year);
        System.out.println(name);
        System.out.println(brand);
        System.out.println("*************");
    }

    public static void main(String[] args){
        JavaLab222 s1 = new JavaLab222();
        s1.show();

        JavaLab222 s2 = new JavaLab222(2023);
        s2.show();

        JavaLab222 s3 = new JavaLab222(2023,"ferari");
        s3.show();
    }
}