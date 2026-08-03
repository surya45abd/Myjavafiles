import java.util.*;

public class Java14Lab{

    double amount_plan = 299;

    public static void main(String[] args){
        Java14Lab j = new Java14Lab();
        j.showPlanDetails();
        j.Rech(199);
    }
    void showPlanDetails(){
        System.out.println("Current plan details : ");
        String Plan_name = "Unlimited 299";
        String validity = "28 days";
        String data = "1.5 gb/day";
        String calls = "unlimited";
        System.out.println(" Plan name = Unlimited 299");
        System.out.println(" validity = 28 days");
        System.out.println(" data = 1.5 gb/day");
        System.out.println(" calls = unlimited");
    }

    void Rech(double amount){
        if(amount >= amount_plan){
            System.out.println("Recharge Succefully !");
        System.out.println(" Recharge amount : $" + amount);
        }else{
        System.out.println("amount is not sufficent !");
        }
    }
}