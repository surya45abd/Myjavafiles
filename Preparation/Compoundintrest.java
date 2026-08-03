import java.util.Scanner;

public class Compoundintrest{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int p;
        int t;
        double r;
        double i;
        double a;

       

        System.out.println("enter the principle : ");
        p = scan.nextInt();

        System.out.println("enter the time : ");
        t = scan.nextInt();

        System.out.println("enter the rate : ");
        r = scan.nextDouble();

        a = p*(Math.pow((1+(r/100)),t));

        i = a-p;
        System.out.println("intrest is : "+ i);
        System.out.println("total amount : " + a);
    }
}