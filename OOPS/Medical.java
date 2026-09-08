import java.util.*;

public class Medical implements Gradeof{
    Scanner s = new Scanner(System.in);
    public void calculategrade(int marks){
       
       int gradepoints = (marks*10)/200;
       System.out.println("medical grade points : " + gradepoints);
    }
}