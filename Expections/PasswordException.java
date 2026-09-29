import java.util.*;

class  Invalidpassexception extends Exception{
    public Invalidpassexception(String message){
        super(message);
    }
}

public class PasswordException{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter your password : ");
        String pass = s.nextLine();

        try{
            if(pass.length() < 8){
                throw new Invalidpassexception("invalid password ");
            }else{
        System.out.println("enter  ");
            }
        }
        catch(Exception e){
        System.out.println(e.toString());
        }
    }
}