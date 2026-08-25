import java.util.*;

public class Array25{
    public static void main(String[] args){
        int[] num = {16,17,4,3,5,2};

        for(int i = 0 ;i<num.length;i++){
            boolean status = true;
            for(int j = i +1 ;j < num.length;j++){
                if(num[i] > num[j]){
                    status = true;
                }else{
                    status = false;
                    break;
                }
            }
            if(status){
                System.out.println(num[i]);
            }
        }
    }
}