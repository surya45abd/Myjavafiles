import java .util.*;

public class Fro06{
    static int display(){
        int num = 3454;
        int val = 0;
        int rev = 0;
        while(num > 0){
            val = num %10;
            num = num /10;
            rev = rev*10 + val;
        }
        return rev;
        
    }
    static  int show(){
        int c = 33564;
        int val = 0;
        int sum = 0;
        while(c >0){
            val = c %10;
            c = c/10;
            sum = sum + val;
        }
        return sum;
    }
    public static void main(String[] args){
        int va1 = display();
        int va2 = show();
        System.out.println(va1);
        System.out.println(va2);
    }
}