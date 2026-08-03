import java.util.*;

public class JavaLab27{
    String name ;
    int roll;
    JavaLab27(){
        System.out.println("hi!!");
    }
     JavaLab27(JavaLab27 j){
        System.out.println("hi!!");
    }

    public static void main(String[] args){
        JavaLab27 j = new JavaLab27();
        j.name = "surya";
        j.roll = 38;
        j.show();
        JavaLab27 j1 = new JavaLab27(j);
        j1.show();
    }
    void show(){
        System.out.println(name);
        System.out.println(roll);
    }
}