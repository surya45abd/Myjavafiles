import java.util.*;

public class Arraysort{
    public static void main(String[] args){
        int[] num = {3,45,65,89,64,778,445,435,0,54,654,3,55,43};
        int[] pow = {3,45,65,89,64,778,445,435,0,54,654,3,55,43};
        int[] sol = new int[5];
       
    
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        System.out.println(Arrays.equals(num,pow));

        Arrays.fill(sol,10);
        System.out.println(Arrays.toString(sol));

        int search = Arrays.binarySearch(num,64);
        System.out.println(search);
    }
}