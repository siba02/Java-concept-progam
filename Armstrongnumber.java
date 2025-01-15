
import java .util.*;
public class Armstrongnumber {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();

        
        int n = x;
        int result = 0;

        
        while (x!= 0) {
            int digit = x % 10;  
            result=result+digit * digit * digit;  
            x=x/10;  
        }


        if (result == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    
}
}
