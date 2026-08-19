import java.util.*;

public class SecondLeast{
    public static void main(String[] args){
        int[] numbers = {1,2,3,0,0,4,5,6,0,7,8,9,-10,-2,-3,-4,-5,-6,-7,-8,-9,0};
        int least = numbers[0];
        for(int i = 0;i < numbers.length;i++){
            if(least > numbers[i]){
                least = numbers[i];
            }
        }
        System.out.println("least number : " + least);
        int secleast = Integer.MAX_VALUE;
        for(int i =0;i <numbers.length;i++){
            if(numbers[i] >least && numbers[i] < secleast ){
                secleast = numbers[i];
            }
        }
        System.out.println("least number : " + secleast);
    }
}