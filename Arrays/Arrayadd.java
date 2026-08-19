import java.util.*;

public class Arrayadd{
    public static void main(String[] args){
        int[] a1 = {3,5,4};
        int[] a2 = {34,54,21};
        int[] a3 = new int[a1.length + a2.length];
        for(int i =0;i <a1.length;i++){
            a3[i] = a1[i];
        } 
        for(int i = 0;i < a2.length;i++){
            a3[a1.length + i] = a2[i];
        }
        System.out.println(Arrays.toString(a3));
    }
}