import java.util.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFound{
    public static void main(String[] args) throws IOException{

        try{
        File f = new File("D:\\Notepad\\hello.txt");
        FileReader fr = new FileReader(f);
        int i = fr.read();
        
            
        while(i != -1){
            System.out.print((char)i);
            Thread.sleep(500);
            i = fr.read();
        }


        }catch(Exception e){
            System.out.println(e.toString());
        }
          System.out.println("");  
        System.out.println("go back");
    }
}