import java.util.*;
public class nprimenumber {
    
    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of prime numbers to print
        System.out.print("Enter the number of prime numbers : ");
        int N = scanner.nextInt();
       

        System.out.println("First " + N + " prime numbers:");
    
}
}
