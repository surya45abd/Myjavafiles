// import java.util.*;

// public class Arrayreverse{
//     public static void main(String[] args){
//         int[] a1 = {1,2,3,4,5,6};
//         int[] a2 = new int[a1.length];
//         int j = 0;
//         for(int i = a1.length - 1;i>=0;i--){
//             a2[j] = a1[i];
//             j++;
//         }
//         System.out.println(Arrays.toString(a2));
//     }
// }

import java.util.*;

public class Arrayreverse{
    public static void main(String[] args){
        int[] a1 = {1,2,3,4,5,6};
        int end = a1.length-1;  // 5
        int start=0;

       while(start<end){
        int temp=a1[start];
        a1[start]=a1[end];
        a1[end]=temp;
        start++;
        end--;

       }

        System.out.println(Arrays.toString(a1)); //
    }
}