import java.util.*;

public class Personalloan extends Loanempl{

     
    public void getRateofIntrest(){
        double rate = 7.0;
        int cibil = getCibil();
        if(cibil >=300 && cibil <=549){
            rate = rate + 4.0;
        }else if(cibil >= 550 && cibil <= 700){
            rate = rate + 3.0;
        }else if(cibil >=701 && cibil <=750){
            rate = rate + 2.0;
        }else if(cibil >= 751 && cibil <=900){
            rate = rate + 1.0;
        }else{
            System.out.println("invalid cibil score!! please check it !!");
        }
        System.out.println("your rate of interest for loan is :" + rate);
    }

    public static void main(String[] args){
        System.out.println("Personal loan process started !!!");

        Personalloan pers = new Personalloan();

        double salary = pers.getSalary();
        int age = pers.getAge();
        // int cibil = home.getCibil();

        if(salary >= 600000 && age >= 25){
            pers.getRateofIntrest();
        }else{
            System.out.println("not eligible for loan!!!!");
        }

        // System.out.println(salary);
        // System.out.println(age);
        // System.out.println(cibil);

        System.out.println("personal loan process ended !!!");
    }
}