import java.util.*;

public class Exam{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("enter");
        int n = scan.nextInt();

        int[]  prices = new int[n];
        for(int i =0; i < prices.length;i++){
         System.out.println("enter the price values : " + i);
            prices[i] = scan.nextInt();
        }

         for(int i =0;i < prices.length;i++){
            for(int j =i+1;j < prices.length;j++){
                if(prices[i]>prices[j]){
                    prices[i]=prices[i]-prices[j];
                }
            }
         }
          System.out.println("prices are");
          System.out.println(Arrays.toString(prices));
        for (int i = 0; i < prices.length; i++){
            System.out.print(prices[i]+" ");
        }
    }
}