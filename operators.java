public class operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators
        System.out.println("Is a greater than b? " + (a > b));
        System.out.println("Is a less than b? " + (a < b));
        System.out.println("Is a equal to b? " + (a == b));

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("Logical AND: " + (x && y));
        System.out.println("Logical OR: " + (x || y));
        System.out.println("Logical NOT: " + (!x));

        // Assignment Operators
        int c = 20;
        c += 5; // c = c + 5
        System.out.println("After += : " + c);

        c -= 3; // c = c - 3
        System.out.println("After -= : " + c);

        c *= 2; // c = c * 2
        System.out.println("After *= : " + c);

        c /= 4; // c = c / 4
        System.out.println("After /= : " + c);

        c %= 3; // c = c % 3
        System.out.println("After %= : " + c);
    }
}