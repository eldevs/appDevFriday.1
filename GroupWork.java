//GroupWork.java
import java.util.Scanner;
public class GroupWork   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
       
        // Calling methods from Calculator.java
        System.out.println("Sum: " + Calculator.add(num1, num2));  // Group 1's method
    }
}
