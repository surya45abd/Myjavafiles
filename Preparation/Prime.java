// import java.util.*;

// public class Prime{
//     public static void main(String[] args){
//         Scanner s = new Scanner(System.in);
//         int n ;
//         System.out.print("enter the number : ");
//         n = s.nextInt();
//         int count = 0;

//         for(int i = 1; i <= n ; i++){
//             if(n%i == 0){
//                 count++;
//             }
//         }
//         if( count > 2){
//             System.out.println(n + " is not prime");
//         }else{
//             System.out.println(n + " is prime");
//         }
//     }
// }




// import java.util.*;

// public class Prime{
//     public static void main(String[] args){
//         Scanner s = new Scanner(System.in);
//         // int l = 1;
//         int f = 100;

//         for(int l = 1; l<=f; l++){

//         int count = 0;
//         for(int i = 1; i <= l ; i++){
//             if(l%i == 0){
//                 count++;
//             }
//         }
//         if( count > 2){
//             System.out.println(l + " is not prime");
//         }else{
//             System.out.println(l + " is prime");
//         }


//     }
//     }
// }




import java.util.*;

public class Prime{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        // int l = 1;
        int f = 1000;

        for(int l = 2; l<=f; l++){

        int count = 0;
        for(int i = 1; i <= l ; i++){
            if(l%i == 0){
                count++;
            }
        }
        if( count > 2){
            System.out.println(l + " is not prime");
        }else{
            System.out.println(l + " is prime");
        }


    }
    }
}