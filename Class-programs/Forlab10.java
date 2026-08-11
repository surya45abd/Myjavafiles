import java.util.*;

public class Forlab10{
    public static void main(String[] args){
        System.out.println("hello!!");
        int sum = 0;
        int odd = 0;
        for(int i = 1;i<=100;i++){
            System.out.println("n = "+i);
        }
        for(int i = 1;i<=100;i++){
            sum = sum+i;
            System.out.println("n = "+sum);
        }
        for(int i = 0;i<=100;i++){
            i = i+1 ;
            System.out.println("n = "+i);
        }
    }
}