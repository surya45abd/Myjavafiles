import java.util.*;

public class Example2{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the value :");
        try{
        int n = s.nextInt();
        }
        catch(Exception e){
        System.out.println(e.toString());
        // System.out.println(e.getMessage());
        }finally{
            System.out.println("we finally 1");
        }

        try{
            System.out.println(10/0);
        }catch(Exception e){
            System.out.println(e.toString());
        }finally{
            System.out.println("finally 2");
        }
        
    }
}