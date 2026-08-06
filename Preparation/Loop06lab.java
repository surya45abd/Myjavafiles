import java.util.*;

public class Loop06lab{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter factorial number : ");
        int num = scan.nextInt();

        int fa = show(num);
        System.out.println(fa);
    }
    static int show(int a){
        
        if(a == 0 || a== 1){
            return 1;
        }
         return a * show(a-1);
    }
}


