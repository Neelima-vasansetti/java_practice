import java.util.Scanner;
public class multi_conditions {
    public static void main(String[] args)
    {
        Scanner src = new Scanner(System.in);
        int age = src.nextInt();
        if (age >= 0 && age <= 12) {
            System.out.println("Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teenager");
        } else if (age >= 20 && age <= 59) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }
    }
}
