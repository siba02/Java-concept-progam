import java.util.Scanner; 

public class SumOfNumbers {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int x = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int y = scanner.nextInt();
        int sum = x + y;
     System.out.println("The sum of the two numbers is: " + sum);

    
        
    }
}
