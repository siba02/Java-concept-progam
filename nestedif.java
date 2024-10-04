public class nestedif {
    public static void main(String[] args) {
        int num = 1000;
        
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
