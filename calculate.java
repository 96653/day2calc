import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Sum: " + (a + b));
        System.out.println("Multiplication: " + (a * b));
<<<<<<< HEAD
        sc.close();
    }
}
=======
        System.out.println("Subtraction: " + (a - b));  // New subtraction feature
        sc.close();
    }
}

>>>>>>> 6b43bbc (adding substraction code)
