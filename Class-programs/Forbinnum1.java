// import java.util.*;

// public class Forbinnum{
//     public static void main(String[] args){
//         Scanner scan = new Scanner(System.in);
//         System.out.println("enter how many numbers can be print : ");
//         int n = scan.nextInt();
//         forbin(n);
//     }
//     static void forbin(int n){
//         int n1 = 0;
//         int n2 = 1;
//         int n3 = 0;
//         System.out.print(n1 + " " + n2);
//         for(int i = 1;i <=n-2; i++){
//             n3 = n1 + n2;
//             n1 = n2 ;
//             n2 = n3 ;
//             System.out.print(" "+ n3);
//         }
//     }
// }




// import java.util.*;

// public class Forbinnum1{
//     public static void main(String[] args){
//         Scanner scan = new Scanner(System.in);
//         String yesorno = "";
        
//         do{
//             System.out.println("enter how many numbers can be print : ");
//             int n = scan.nextInt();
//             forbin(n);
//             System.out.println();
//             System.out.println("enter again or not y (or) n : ");
//             yesorno = scan.next();
//         }while(yesorno.equalsIgnoreCase("y"));
//     }
//     static void forbin(int n){
//         int n1 = 0;
//         int n2 = 1;
//         int n3 = 0;
//         System.out.print(" " + n1 + " " + n2);
//         for(int i = 1;i <=n-2; i++){
//             n3 = n1 + n2;
//             n1 = n2 ;
//             n2 = n3 ;
//             System.out.print(" "+n3);
//         }
//     }
// }



// import java.util.*;

// public class Forbinnum1{
//     public static void main(String[] args){
//         Scanner scan = new Scanner(System.in);
//         System.out.println("enter how many numbers can be print : ");
//         int n = scan.nextInt();
//         System.out.println("which position do you want to print : ");
//         int pos = scan.nextInt();
//         forbin(n,pos);
//     }
//     static void forbin(int n ,int pos){
//         int n1 = 0;
//         int n2 = 1;
//         int n3 = 0;
//         System.out.print(n1 + " " + n2);
//         for(int i = 1;i <=n-2; i++){
//             n3 = n1 + n2;
//             n1 = n2 ;
//             n2 = n3 ;
//             System.out.print(" "+ n3);
            
//         }

//          int p1 = 0;
//         int p2 = 1;
//         int p3 = 0;
//         for(int i = 1;i <=n-2; i++){
//             p3 = p1 + p2;
//             p1 = p2 ;
//             p2 = p3 ;
//             // System.out.print(" "+ n3);
//             if(i == pos-2){
//              System.out.println("");   
//             System.out.print("position "+ pos +":"+ p3);
//             }
//         }
//     }
// }





import java.util.*;

public class Forbinnum1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter how many numbers can be print : ");
        int n = scan.nextInt();
        System.out.println("which position do you want to print : ");
        int pos = scan.nextInt();
        forbin(n,pos);
    }
    static void forbin(int n ,int pos){
        int n1 = 0;
        int n2 = 1;
        int n3 =0;
        int posval = 0;
        
        if(pos < 0 || pos > n){
            System.out.println("invalid position");
            return;
        }
        for(int i = 1;i <=n ;i++){
            if(i == 1){
            n3 =n1;
            }else if(i == 2){
            n3 =n2;
            }else{
                n3 = n1+n2;
                n1=n2;
                n2=n3;
            }
            System.out.print(n3+" ");

            if(i==pos){
                posval = n3;
            }
        }
            System.out.print(" value : "+posval+" ");
        
    }
}

