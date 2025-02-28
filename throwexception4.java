



public class throwexception4 {
    public static void main(String[] args) {
        try {
            checkEligibility(10);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
        public static void checkEligibility(int age){
            if(age < 18){
                throw new ArithmeticException("You are not eligible to vote.");
            }else{
                System.out.println("You are eligible to vote.");
            }
            
            // if(age < 18){
            //     throw new FileNotFoundException("You are not eligible to vote.");
            // }else{
            //     System.out.println("You are eligible to vote.");
            // }
        }
    
}
