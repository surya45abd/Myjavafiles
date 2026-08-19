import java.util.*;

public class Search{
    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);
        int[] a1 = {54,65,67,32,45,33,10,39,100,435};
        System.out.println("enter the search number : ");
        int search = scan.nextInt();
        boolean status = false;
        for(int n:a1){
            if(n == search){
                status = true;
                break;
            }
        }
        if(!status){
                System.out.println("number is not found : "+search);
        }else{
                System.out.println("number found : "+ search);
        }
    }
}