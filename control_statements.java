public class control_statements {

    public static void main(String[] args) {
        int number = 30;

        // If statement
        if (number > 0) {
            System.out.println("Number is positive.");
        }

        // If-else statement
        if (number < 0) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is non-negative.");
        }

        // Switch statement
        switch (number) {
            case 1:
                System.out.println("Number is one.");
                break;
            case 2:
                System.out.println("Number is two.");
                break;
            case 3:
                System.out.println("Number is three.");
                break;
            case 10:
                System.out.println("Number is ten.");
                break;
            default:
                System.out.println("Number is neither one nor ten.");
        }
    }
}