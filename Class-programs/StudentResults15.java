import java.util.*;

public class StudentResults15{

    void displayStudent(String fname , String lname){
        System.out.println("Student fullName is : " + fname + " " + lname);
    }
    void displayMarks(int tel, int hin, int eng){
        System.out.println("Student Marks in tel: " + tel + " marks in hin :" + hin + " marks on eng :" + eng);
    }
    void DisplaySum(double sum){
        System.out.println("Sum of all subjects :" + sum);
    }
    void displayAverage(double avg){
        System.out.println("Average of all subjects :" + avg);
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        StudentResults15 a = new StudentResults15();

        System.out.println("Main Method Started !!");

        System.out.println("enter the tel marks :");
        int tel = s.nextInt();
        System.out.println("enter the hin marks :");
        int hin = s.nextInt();
        System.out.println("enter the eng marks :");
        int eng = s.nextInt();
        double sum = tel + hin + eng;
        double avg = (tel + hin + eng)/3;

        System.out.println("enter the Student fname :");
        s.nextLine();
        String fname = s.nextLine();

        System.out.println("enter the Student lname :");
        String lname = s.nextLine();

        

        a.displayStudent(fname,lname);
        a.displayMarks(tel,hin,eng);
        a.DisplaySum(sum);
        a.displayAverage(avg);

        System.out.println("Main Method Ended !!");
    }
}