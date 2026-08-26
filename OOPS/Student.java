import java.util.*;

public class Student{
    private int num;
    private int sal;
    private String name;

    public void setNum(int nume){
        if(nume > 18){
        this.num = nume;
        }
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSal(int sal){
        this.sal = sal;
    }

    public int getNum(){
        return num;
    }
    
    public String getName(){
        return name;
    }
    public int getSal(){
        return sal;
    }

}