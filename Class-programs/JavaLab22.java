import java.util.*;

public class JavaLab22{

        int ifsc_code;
        String Account_holder;
        int balance;
        Scanner scan = new Scanner(System.in);
        static long next_num = 1000001;
        long account_no;

        public JavaLab22(){

            account_no = next_num;
            next_num ++;
            System.out.println("enter the ifc code : ");
            ifsc_code = scan.nextInt();
            scan.nextLine();
            System.out.println("enter the name : ");
            Account_holder = scan.nextLine();
            System.out.println("enter the balance : ");
            balance = scan.nextInt();
     
        }
        void show(){
            System.out.println("your ifsc code is : "+ifsc_code);
            System.out.println("your account holder name : "+Account_holder);
            System.out.println("your account balance : "+balance);
            System.out.println("your account no : "+account_no );
            System.out.println("*%*%*%*%*%*%*%*%*%*%*%*%*%*%*%*%*%*%");
        }
        


    public static void main(String[] args){

        

        JavaLab22 s1 = new JavaLab22();
        s1.show();
        JavaLab22 s2 = new JavaLab22();
        s2.show();
        JavaLab22 s3 = new JavaLab22();
        s3.show();
        JavaLab22 s4 = new JavaLab22();
        s4.show();



    }
}