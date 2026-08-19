import java.util.*;

public class Addition{
    public static void main(String[] args){
        // int[] a1 = {4,6,5};
        // int[] a2 = {54,76,43};
        // int[] a3 = new int[3];
        // for(int i = 0;i<a1.length;i++){
        //     a3[i] = a1[i] + a2[i];
        // }
        // System.out.println(Arrays.toString(a3));


        int[] a1 = {45,67,32};
        int[] a2 = {54,32,78,54,23};
        int leng = 0;
        if(a1.length > a2.length){
            leng = a1.length;
        }else{
            leng = a2.length;
        }

        int[] a3 = new int[leng];

        for(int i =0;i < leng;i++){
            if(a1.length <= i){  
                a3[i] = a2[i];
            }else if(a2.length <= i){
                a3[i] = a1[i];
            }else{
                a3[i] = a1[i] + a2[i];
            }
        }
        System.out.println(Arrays.toString(a3));
    }
}