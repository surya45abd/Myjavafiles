import java.util.*;
import java.io.File;

public class Ioexception{
    public static void main(String[] args) throws Exception{

        // try{
        // File f = new File("D:\\Notepad\\hello.pdf");
        // boolean b = f.createNewFile();
        //     if(b){
        //         System.out.println("created");
        //     }else{
        //         System.out.println("some thing went wrong");
        //     }

        // }catch(Exception e){
        //     // System.out.println(e.toString());
        //     e.printStackTrace();
        // }
        //     System.out.println("some thing went wrong");

        File f = new File("D:\\Notepad\\hello.doc");
        boolean b = f.createNewFile();
            if(b){
                System.out.println("created");
            }else{
                System.out.println("some thing went wrong");
            }

        
            System.out.println("some thing went wrong");
    }
}