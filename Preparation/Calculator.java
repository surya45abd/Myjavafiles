import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("enter the first number : ");
        double firstnumber = scan.nextDouble();

        // System.out.print("enter one of these  + , - , * , / ");
        System.out.print("enter one of these  + , - , * , / ");
        String operator = scan.next();

        System.out.print("enter the second number : ");
        double secondnumber = scan.nextDouble();

       switch(operator){
        case "+" -> System.out.println(firstnumber + secondnumber);
        case "-" -> System.out.println(firstnumber - secondnumber);
        case "*" -> System.out.println(firstnumber * secondnumber);
        case "/" -> System.out.println(firstnumber / secondnumber);
        default -> System.out.println("not valid option");
       };
    }
}