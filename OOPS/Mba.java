import java.util.*;

public class Mba implements Gradeof{
    Scanner s = new Scanner(System.in);
    public void calculategrade(int marks){
       int gradepoints = (marks*10)/80;
       System.out.println("for mba grade points :" + gradepoints);
    }
}