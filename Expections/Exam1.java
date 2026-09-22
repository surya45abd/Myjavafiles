import java.util.*;

public class Exam1{
    public static void main(String[] args){
        System.out.println("start!!");
        try{
            System.out.println(0/0.0);
        }catch(Exception e){
            System.err.println("catch");
        }finally{
            System.err.println("finall][ry][[ptr][");
        }
        System.out.println("end  !!");
    }
}