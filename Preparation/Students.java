public class Students {

    int rollNo;
    String name;
    int age;
    String course;
    static String collegeName = "XYZ University";
    int ph = 897;

    // Method to display student details
    

    public static void main(String[] args) {

        Students s1 = new Students();
        s1.rollNo = 101;
        s1.name = "Goutham";
        s1.age = 21;
        s1.course = "Java";

        System.out.println("Roll No : " + s1.rollNo);
        System.out.println("Name    : " + s1.name);
        System.out.println("Age     : " + s1.age);
        System.out.println("Course  : " + s1.course);
        System.out.println("College : " + collegeName);
        System.out.println("Phone   : " + s1.ph);
        System.out.println();

        Students s2 = new Students();
        s2.rollNo = 102;
        s2.name = "Rahul";
        s2.age = 22;
        s2.course = "Python";

        System.out.println("Roll No : " + s2.rollNo);
        System.out.println("Name    : " + s2.name);
        System.out.println("Age     : " + s2.age);
        System.out.println("Course  : " + s2.course);
        System.out.println("College : " + collegeName);
        System.out.println();

        Students s3 = new Students();
        s3.rollNo = 103;
        s3.name = "Priya";
        s3.age = 20;
        s3.course = "React";
 

        System.out.println("Roll No : " + s3.rollNo);   
        System.out.println("Name    : " + s3.name);
        System.out.println("Age     : " + s3.age);
        System.out.println("Course  : " + s3.course);
        System.out.println("College : " + collegeName);
        System.out.println();
    }
}