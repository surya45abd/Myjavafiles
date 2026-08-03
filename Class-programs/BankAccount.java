import java.util.*;

public class BankAccount{
    public static void main(String[] args){
        System.out.println("main method");

        BankAccount bank = new BankAccount();
        bank.AccountDetails_1();
        AccountDetails_2();
    }

    void AccountDetails_1(){
        int Account_no = 4533;
        String Account_name = "Surya";
        String Account_type = "Savings";
        int Balance = 410;
        
        System.out.println(Account_no);
        System.out.println(Account_name);
        System.out.println(Account_type);
        System.out.println(Balance);
    }

    static void AccountDetails_2(){
        int Account_no = 4533;
        String Account_name = "Suri";
        String Account_type = "Savings";
        int Balance = 410;
        
        System.out.println(Account_no);
        System.out.println(Account_name);
        System.out.println(Account_type);
        System.out.println(Balance);
    }
}