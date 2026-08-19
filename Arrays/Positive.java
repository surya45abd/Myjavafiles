import java.util.*;

public class Positive{
    public static void main(String[] args){
        int[] numbers = {1,2,3,0,0,4,5,6,0,7,8,9,-10,-2,-3,-4,-5,-6,-7,-8,-9,0};
        int posco = 0;
        int negco = 0;
        int zerco = 0;
        for(int i = 0;i < numbers.length; i ++){
            if(numbers[i]>0){
                posco++;
            }else if(numbers[i]<0){
                negco++;
            }else{
                zerco++;
            }
        }
        System.out.println(posco);
        System.out.println(negco);
        System.out.println(zerco);
        int[] positive = new int[posco];
        int[] negitive = new int[negco];
        int[] zeritive = new int[zerco];

        int p = 0;
        int n = 0;
        int z = 0;
        for(int i = 0; i<numbers.length;i++){
            if(numbers[i] > 0){
                positive[p] = numbers[i];
                p++;
            }else if(numbers[i] < 0){
                negitive[n] = numbers[i];
                n++;
            }else{
                zeritive[z] = numbers[i];
                z++;
            }
        }
        System.out.println(Arrays.toString(positive));
        System.out.println(Arrays.toString(negitive));
        System.out.println(Arrays.toString(zeritive));

    }
}