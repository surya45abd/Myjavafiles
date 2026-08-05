// import java.util.*;

// public class Switch03{
//     public static void main(String[] args){
//         Scanner scan = new Scanner(System.in);
//         System.out.println("enter the number : ");
//         int num = scan.nextInt();

//         switch(num){
//             case 10:
//             System.out.println("very good!!!!");
//             break;
//             case 9:
//             System.out.println("good!!!!");
//             break;
//             case 8:
//             System.out.println(" ok !!!!");
//             break;
//             case 7:
//             System.out.println("well try!!!!");
//             break;
//             case 6:
//             System.out.println("try hard !!!!");
//             break;
//             case 5,4,3,2,1,0:
//             System.out.println("very bad!!!!");
//             break;
//         }
//     }
// }



// import java.util.*;

// public class Switch03{
//     public static void main(String[] args){
//         Scanner scan = new Scanner(System.in);
//         System.out.println("enter the number : ");
//         int num = scan.nextInt();

//         switch(num){
//             case 10 ->System.out.println("very good!!!!");
//             case 9  ->System.out.println("good!!!!");
//             case 8  ->System.out.println(" ok !!!!");
//             case 7 ->System.out.println("well try!!!!");
//             case 6 ->System.out.println("try hard !!!!");
//             case 5,4,3,2,1,0 ->System.out.println("very bad!!!!");
//             default -> System.out.println("Alert !!!!");
//         }
//     }
// }

// import java.util.*;
// public class Switch03{
//     public static void main(String[] args){
//         Scanner scan = new Scanner(System.in);
//          int silprice = 200;
//         int golprice = 300;
//       int plaprice = 500;
//         String yn = "";

// do{
//         System.out.println("enter what do you want to buy gold,silver,platinum :");
//         String type = scan.next();
//         System.out.println("enter your age :");
//         int age = scan.nextInt();

//         switch(type){
//         case "silver" :{
//         if(age >= 60){
//             silprice = silprice - ((silprice*20)/100);
//         System.out.println(silprice);
//         }else{
//         System.out.println(silprice);
//         }
//         break;
//     }
//         case "gold" :{
//         if(age >= 60){
//             golprice = golprice - ((golprice*20)/100);
//         System.out.println(golprice);
//         }else{
//         System.out.println(golprice);
//         }
//         break;
//     }
//         case "platinum" :{
//         if(age >= 60){
//             plaprice = plaprice - ((plaprice*20)/100);
//         System.out.println(plaprice);
//         }else{
//         System.out.println(plaprice);
//         }
//         break;
//     }
//         default :
//         System.out.println("enter valid type !!!!!");
//         }
//         System.out.println(" y or n");
//         yn = scan.next();
//     }while(yn.equalsIgnoreCase("y"));
//     }
// }

import java.util.*;

public class Switch03{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter day of week");
        String day = scan.nextLine();
        switch(day){
            case "monday" -> System.out.println("1st day of week");
            case "tuesday" -> System.out.println("2st day of week");
            case "wednesday" -> System.out.println("3st day of week");
            case "thursday" -> System.out.println("4st day of week");
            case "friday" -> System.out.println("5st day of week");
            case "saturaday" -> System.out.println("6st day of week");
            case "sunday" -> System.out.println("7st day of week");
            default -> System.out.println("invalid");
        }
    }
}