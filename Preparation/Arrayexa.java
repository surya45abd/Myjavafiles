import java.util.Scanner;

public class Arrayexa{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] marks = new int[5];
        System.out.println("enter the marks");

        for(int i = 0; i < marks.length; i++){
            marks[i] = scan.nextInt();
        }
        System.out.println("marks are");
        for (int i = 0; i < marks.length; i++){
            System.out.print(marks[i]+" ");
        }
    }
}