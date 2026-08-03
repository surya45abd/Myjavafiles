import java.util.*;

// public class Test25{
//     Test25(){
//         this(10);
//         System.out.println("no-arg");
//     }
//     Test25(int x){
//         System.out.println("arg");
//     }
//     public static void main(String[] args){
//         new Test25();
//     }
// }

// public class Test25{
//     Test25(){
//         this();
//     }
    
//     public static void main(String[] args){
//         new Test25();
//     }
// }

public class Test25{
    Test25(){
        System.out.println("con");
    }
    {
        System.out.println("ins");
    }
    public static void main(String[] args){
        new Test25();
    }
}