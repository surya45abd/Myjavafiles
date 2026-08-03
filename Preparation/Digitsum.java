import java.util.Scanner;

public class Digitsum{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("enter the number :");
    int number = scan.nextInt();
    int sum = 0;

    while(number > 0){
        int j = number % 10;
        // sum += j;
        sum = sum + j;
        number = number / 10;
        // number/= 10;
    }
    System.out.println(sum);

}
}