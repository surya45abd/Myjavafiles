import java.util.*;

public class Java23this{

    String car ;
    String brand;
    int year;
    int price;
    String owner;

    public Java23this(){
        this("maruthi-92R","suzuki");
    }
    public Java23this(String car,String brand){
        this(car,brand,2000);
    }
    public Java23this(String car,String brand,int year){
        this(car,brand,year,54000);
    }
    public Java23this(String car,String brand,int year,int price){
        this(car,brand,year,price,"surya");
    }
    public Java23this(String car,String brand,int year,int price,String owner){
                 this.car = car;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.owner = owner;

}
    

    public static void main(String[] args){
        Java23this s1 = new Java23this();
        s1.show();
       Java23this s2 = new Java23this("Swift", "Suzuki");
        s2.show();

        Java23this s3 = new Java23this("Creta", "Hyundai", 2024);
        s3.show();

        Java23this s4 = new Java23this("Nexon", "Tata", 2025, 900000);
        s4.show();

        Java23this s5 = new Java23this(
            "Thar", "Mahindra", 2026, 1500000, "Suresh"
        );
        s5.show();
    }

    void show(){
        System.out.println("car name :" + car);
        System.out.println("car brand : " + brand);
        System.out.println("car year : " + year);
        System.out.println("car price : "+price);
        System.out.println("car owner : "+ owner);
        System.out.println("***************************");
    }

}