import java.util.*;

class Duplicateusername extends Exception{
    public Duplicateusername(String message){
        super(message);
    }
}

public class Userexception{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    System.out.println("enter the name : ");
        String name = s.nextLine();

        try{
        if(name.length() < 8){
            throw new Duplicateusername("invalid name");
        }else{
            System.out.println("good");
        }
    }catch(Exception e){
        System.out.println(e.toString());
    }

    System.out.println("end");
    }
}