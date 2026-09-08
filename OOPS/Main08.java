import java.util.*;

public class Main08{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the marks");
        int n = s.nextInt();
        Gradeof E = new Engineering();
        E.calculategrade(n);
        Gradeof M = new Medical();
        M.calculategrade(n);
        Gradeof m = new Mba();
        m.calculategrade(n);
    }
}