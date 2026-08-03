import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int j = n / i;  
            System.out.println(j);     // calculate j
            sum += i * j;        // add i*j to sum
            System.out.println(sum);
        }

        System.out.println("The final sum is: " + sum);
        sc.close();
    }
}
