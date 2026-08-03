import java.util.*;

public class Prime{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n ;
        System.out.print("enter the number : ");
        n = s.nextInt();
        int count = 0;

        for(int i = 1; i <= n ; i++){
            if(n%i == 0){
                count++;
            }
        }
        if( count > 2){
            System.out.println(n + " is not prime");
        }else{
            System.out.println(n + " is prime");
        }
    }
}