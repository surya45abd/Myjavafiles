import java.util.*;


class Invalidageexception extends Exception{
    public Invalidageexception(String message){
        super(message);
    }
}

public class Userdefined{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your age ! : ");
        int age = s.nextInt();

       try{
        if(age < 18){
            throw new Invalidageexception("invalid age");
        }else{
            System.out.println("good");
        }
       }catch(Exception e){
        System.out.println(e.toString());
       }
    }
}