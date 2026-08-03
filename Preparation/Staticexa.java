

public class Staticexa{


//     Staticexa is = new Staticexa();
    


    
 static{
         System.out.println("static2");
    }

    public static void main(String[] args){
        System.out.println("main");
        Staticexa is = new Staticexa();
        
    }
    static{
         System.out.println("static");
    }
    {
         System.out.println("ins");
    }
    {
         System.out.println("ins2");
    }
   
}