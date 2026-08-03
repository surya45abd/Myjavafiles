import java.util.*;

public class JavaLab20{

    static int add(int a, int b){
        return a+b;
    }
    static int sub(int a, int b){
        return a-b;
    }
    static int mul(int a, int b){
        return a*b;
    }
    static int div(int a, int b){
        return a/b;
    }


    public static void main(String[] args){
        JavaLab20 j = new JavaLab20();
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the first number : ");
        int fir = scan.nextInt();
        System.out.println("enter the second number : ");
        int sec = scan.nextInt();
        int a = add(fir,sec);
        int b = sub(fir,sec);
        int c = mul(fir,sec);
        int d = div(fir,sec);
        System.out.println("addition : " + a);
        System.out.println("subtraction : "+ b);
        System.out.println("multiplication : " + c);
        System.out.println("division : " + d);
        
    }
}