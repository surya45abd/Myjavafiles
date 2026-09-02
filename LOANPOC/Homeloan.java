import java.util.*;

public class Homeloan extends Loanempl{
    public static void main(String[] args){
        System.out.println("home loan process started !!!");

        Homeloan home = new Homeloan();

        double salary = home.getSalary();
        int age = home.getAge();
        // int cibil = home.getCibil();

        if(salary >= 600000 && age >= 25){
            home.getRateofIntrest();
        }else{
            System.out.println("not eligible for loan!!!!");
        }

        // System.out.println(salary);
        // System.out.println(age);
        // System.out.println(cibil);

        System.out.println("home loan process ended !!!");
    }
}