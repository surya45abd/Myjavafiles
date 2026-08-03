import java.util.*;

public class Examsat{
    public static void main(String[] args){
        // String name = "noonj";
        // // System.out.println(name.charAt(1));
        // for(int i = 0; i<name.length()/2;i++){
        //     if(name.charAt(i) != name.charAt(name.length()-1-i)){
        //         System.out.println("Not a Palindrom");
        //         return;
        //     }
        // }
        // System.out.println("Palindrom");


        // for (int i = 6; i >0 ; i--){
        //     for(int j = i; j > 0; j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        int n = 5;
        for(int i = 1; i<n; i++){
            for(int j = 1; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}