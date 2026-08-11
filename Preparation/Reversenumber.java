// import java.util.*;

// public class Reversenumber{
//     public static void main(String[] args){
//         int num = 1234567890;
//         int reverse = 0;
//         int val;

//         while(num > 0){
//             val = num % 10;
//             num = num / 10;
//             reverse = reverse * 10 + val;
//         }
//         System.out.println(reverse);
//     }
// }


import java.util.*;

public class Reversenumber {
    public static void main(String[] args){

        int num = 1230;
        int digit = 0;

        System.out.print("Reverse : ");

        while(num > 0){

            digit = num % 10;

            System.out.print(digit);

            num = num / 10;
        }
        System.out.println(digit + 2);
    }
}