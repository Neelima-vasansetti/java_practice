public class OperatorsExample {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Unary Operators
        System.out.println("Post Increment: " + (a++));
        System.out.println("Pre Increment: " + (++a));
        System.out.println("Post Decrement: " + (b--));
        System.out.println("Pre Decrement: " + (--b));

        // Assignment Operators
        int x = 10;
        x += 5;
        System.out.println("x += 5 : " + x);

        x *= 2;
        System.out.println("x *= 2 : " + x);

        // Relational Operators
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        // Logical Operators
        boolean p = true;
        boolean q = false;

        System.out.println("p && q : " + (p && q));
        System.out.println("p || q : " + (p || q));
        System.out.println("!p : " + (!p));

        // Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("Largest number: " + max);

        // Bitwise Operators
        int c = 6;
        int d = 3;

        System.out.println("c & d : " + (c & d));
        System.out.println("c | d : " + (c | d));
        System.out.println("c ^ d : " + (c ^ d));

        // instanceof Operator
        String str = "Hello";
        System.out.println(str instanceof String);

    }
}