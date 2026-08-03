import java.util.*;

public class Rectangle{

    void calculateArea(){

        int length = 20;
        int breath = 30;

        int area = length*breath;

        System.out.println(area);
    }

    public static void main(String[] args){
        Rectangle rac = new Rectangle();
        System.out.println("hello");
        rac.calculateArea();
    }
}