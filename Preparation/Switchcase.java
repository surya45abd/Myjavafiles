import java.util.Scanner;

public class Switchcase{
    public static void main(String[] args){

        // String day = "monday";
        // String we = switch(day){
        //    case "monday" -> "it is not good";
        //    case "tuesday" -> "it is not good";
        //    case "wednesday" -> "it is not good";
        //    case "thursday" -> "it is not good";
        //    case "friday" -> "it is not good";
        //    case "saturday" -> "it is  good";
        //    case "sunday" -> "it is  good";
        //    default -> "not valid";
        // };
        // System.out.println(we);

        Scanner scan = new Scanner(System.in);
        System.out.print("enter the marks : ");
        int marks = scan.nextInt();

        String results = switch (marks/10) {
            case 10 -> "A+";
            case 9 -> "A";
            case 8 -> {
             String we =    (marks >= 85) ? "B+" : "B";
             yield we;
            }
            case 7 -> {
                String wee = (marks >=75) ? "C+" : "C";
                yield wee;
            }
            case 6 -> {
                String weee = (marks >=65) ? "D+" : "D";
                yield weee;
            }
            default -> "fail";
        };
        System.out.println(results);
    }
}