import java.util.*;

public class Example3{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
       
        try{
            System.out.println("enter passanger id:");
            String id = s.nextLine();
            int passid = Integer.parseInt(id);
             System.out.println("enter age:");
            String age = s.next();
            int passage = Integer.parseInt(age);
             System.out.println("enter passanger seat:");
            String seat = s.next();
            int passseat = Integer.parseInt(seat);
        }catch(Exception e){
            System.out.println(e.toString());
        }

        try{
            System.out.println("enter the name :");
            s.nextLine();
            String name = s.nextLine();
        }catch(Exception e){
            System.out.println(e.toString());
        }
        
    }
}