import java.util.*;

public class Loanempl implements Loan{

    static Scanner scan = new Scanner(System.in);

    public double getSalary(){
        System.out.println("enter the salary : ");
        double salary = scan.nextInt();
        return salary;
    }

    public int getAge(){
        System.out.println("enter the age : ");
        int age = scan.nextInt();
        return age;
    }

    public int getCibil(){
        System.out.println("enter the cibil : ");
        int cibil = scan.nextInt();
        return cibil;
    }
    
    public void getRateofIntrest(){
        double rate = 6.0;
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
}