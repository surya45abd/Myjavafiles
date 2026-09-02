import java.util.*;

public class Distanceof27{

    static int display(int[] x,int a, int b){
        boolean adis = false;
        boolean bdis = false;
        int av = 0;
        int bv = 0;
        for(int i = 0;i <x.length;i++){
            if(a == x[i]){
                adis = true;
                av = i;
            }
            if(b == x[i]){
                bdis = true;
                bv = i;
            }
        }

        if(!(adis && bdis)){
            return -1;
        }else{
            return Math.abs(bv-av);
        }



    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array values :");
        for(int i = 0;i<n;i++ ){
            arr[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("enter A : ");
        int a = s.nextInt();
        System.out.println("enter B : ");
        int b = s.nextInt();
        int result = display(arr,a,b);
        System.out.println(result);
    }
}