import java.util.*;


class Vechical{
    private int no ;

    void display(int n){
        this.no = n;
        System.out.println(no);
    }
}

public class Cart01{
    public static void main(String[] args){
        System.out.println("hello!!!");
        Vechical v = new Vechical();
        v.display(6);
    }
}