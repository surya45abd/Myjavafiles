import java.util.*;

public class Engineering implements Gradeof{
    Scanner s = new Scanner(System.in);
    
    public void calculategrade(int marks){
      
       double gradepoints = (marks*10)/100;
       System.out.println("engineering points : " + gradepoints);

       if(gradepoints > 8.0 && gradepoints <= 10.0){
            System.out.println("grade is A++");
       }
    }
}