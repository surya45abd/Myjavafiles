import java.util.*;

// public class Java14{
//     public static void main(String[] args){

//         System.out.println("main is started !");

//         Java14 r = new Java14();

//         r.hello("surya");

//         System.out.println("main is ended !");
//     }

//     void hello(String name){
//         System.out.println(name);
//     }
// }


public class Java14{

        double balance = 200;


    public static void main(String[] args){

        Java14 y = new Java14();
        y.checkbalance();
        y.deposite(300);
        y.withdrawl(900);

    }
    void checkbalance(){
        System.out.println(balance);
    }

    void deposite(double amount){
        
        balance = amount+balance;
        System.out.println("deposite amount : "+ amount);
        checkbalance();
    }

    void withdrawl(double amount){

        if(amount > balance ){
        System.out.println("not avaliable !" + "balance :" +balance +" withdral amount" + amount);
        }else{
            balance = balance - amount;
        System.out.println("withdrawl amount :" + amount);
        checkbalance();
        }

        // balance = balance - amount;
        // System.out.println("withdrawl amount :" + amount);
        // checkbalance();
    }

}
