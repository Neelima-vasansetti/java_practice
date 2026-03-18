import java.util.Scanner;
public class input
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number:");
        int a = sc.nextInt();
        sc.nextLine
        System.out.println("enter the second number:");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("the sum of the two numbers is:"+sum);
        sc.close();
    }
}
