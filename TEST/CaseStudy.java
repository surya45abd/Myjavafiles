import java.util.*;

public class CaseStudy{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the rating : ");
        int R = s.nextInt();
        String Results = R >= 4 ? "eligibal for bonous" : "not eligibal for bonouse";
        System.out.println(Results);
    }
}