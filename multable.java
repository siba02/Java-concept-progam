import java.util.Scanner;

public class multable {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number to find the multable : ");
        int x = scanner.nextInt();
       
        
        for (int i = 1; i<=10; i++) {
            System.out.println( "multable is" + ":"+ " "+x*i);
    }
    
}
}