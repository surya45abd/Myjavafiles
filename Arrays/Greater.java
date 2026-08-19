import java.util.*;

public class Greater{
    public static void main(String[] args){
        int[] a1  = {5,4,7,4,8,2,9,12,65,3,6,7,6,34,5654,3323,453,5,3555};
        int max = a1[0];
        int min = a1[0];
        for(int i = 0;i<a1.length;i++){
            if(max < a1[i]){
                max = a1[i];
            }
            if(min > a1[i]){
                min = a1[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}