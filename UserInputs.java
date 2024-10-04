import java.util.Scanner;

public class UserInputs {
    public static void main(String[] args) {
        Scanner myvalue = new Scanner(System.in);
        
        
        System.out.println("Enter your name:");
        String name = myvalue.nextLine();
        
        System.out.println("Enter your age:");
        int age = myvalue.nextInt();
        
    
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
    }
}
