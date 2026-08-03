import java.util.*;

public class Tables{

    public static void main(String[] args){
        System.out.println("!!!!START!!!!");
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the number : ");
        int i = scan.nextInt();
        for(int k = 1; k <= 20 ; k++){
            System.out.println( i +" * " +k+ " = "+(i*k));
        }



        System.out.println("!!!! END !!!!");
    }
}