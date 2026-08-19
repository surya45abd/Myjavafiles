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
        int j = a1.length-1;  // 5
        for(int i =0;i < a1.length;i++){ // i = 0 1
            a1[j] = a1[i]; // a1[2] = a1[3]                 3  2 1
            j--;
        }
        System.out.println(Arrays.toString(a1)); //
    }
}