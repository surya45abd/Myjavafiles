import java.util.*;

public class Main{
    public static void main(String[] args){
        System.out.println("main");
        Attedence d = new Developer();
        d.marksAttedence();
        Attedence t = new Test();
        t.marksAttedence();
        Attedence m = new Manager();
        m.marksAttedence();
    }
}