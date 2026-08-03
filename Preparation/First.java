import java.util.Scanner;

class First
{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

       System.out.print("enter the number : ");
       String num = s.nextLine();
       System.out.println(num);

       System.out.print("enter the character : ");
        char sum =  s.next().charAt(2);
        System.out.print(sum);
   
    }
}