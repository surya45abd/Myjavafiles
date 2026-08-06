import java.util.*;

public class Loops06{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("enter the number : ");
    int n = scan.nextInt();
    
    int num = flow(n);
    System.out.println(num);
}
 static int flow(int n){
    int fact = 1;
    for(int i = n;i>=1;i--){
        fact = i* fact;
    }
    return fact;
}
}