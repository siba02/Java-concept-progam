import java.util.*;

public class nestedif {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (num > 0) {
            System.out.println("Number is positive");
            
            if (num % 2 == 0) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }
        } else {
            System.out.println("Number is negative");
        }
    }    
}
