public class Example {

    // Variables
    String name = "Goutham";
    int age = 21;

    public static void main(String[] args) {

        // Creating an object
        Example s1 = new Example();

        // Accessing variables
        System.out.println("Name : " + s1.name);
        System.out.println("Age : " + s1.age);
         


        Example s2 = new Example();

        // Accessing variables
        System.out.println("Name : " + s2.name + ", hello");
        System.out.println("Age : " + s2.age);

    }

}