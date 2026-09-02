import java.util.*;

class Student{
    String name;
    int age;
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
}

public class Person02 extends Student{

    String college;
    Person02(String nam,int age,String college){
        super(nam,age);
        this.college = college;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(college);
    }

    public static void main(String[] args){
        Person02 n = new Person02("surya", 25,"aditya");
        n.display();
    }
}