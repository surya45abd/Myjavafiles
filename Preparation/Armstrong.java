import java.util.*;

public class Armstrong{
    public static void main(String[] args){
        int num = 354474341;
        int sum = 0;
        int val;
        int prime = 0;
        
            while(num > 0){
            val = num % 10;
            num = num / 10;
            int count = 0;
                for (int i = 1; i <= val ; i++){
                    if(val % i == 0){
                        count ++;
                    }
                }
                
                if(count == 2){
                    System.out.println("prime number : " + val);
                    prime = prime*10 + val;
                }


            }

            System.out.println(prime);

            while(prime > 0){
                val = prime %10;
                prime = prime /10;
                System.out.println(val);
            }
            
        
    }
}