

public class Stamet{
    public static void main(String[] args){

        Stamet t = new Stamet();

        System.out.println("main method");
        hello();
        t.welcome();
    }
    
    public static void hello() {
        System.out.println("hello method");
    }

    void welcome() {
        System.out.println("welcome method");
    }
}