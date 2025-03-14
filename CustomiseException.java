public class CustomiseException {
    public static void main(String[] args) {
        try {
            checkEligibility(25);
        } catch (InvalidAgeException e) {      
            System.out.println(e.getMessage());
        }
    }
        public static void checkEligibility(int age) {   
            if(age < 18){
                throw new InvalidAgeException("You are not eligible to vote.");
            }else{
                System.out.println("You are eligible to vote.");
            }
            
    
}
}   
