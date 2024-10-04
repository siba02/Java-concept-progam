public class Arithmaticoperators {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 5;
         
        String num3="20";
        String num4="30";

        int a1=Integer.parseInt(num4);
        int a2=Integer.parseInt(num3);
        
        int sum = num1 + num2;
        int diff = num1 - num2;
        int product = num1 * num2;
        int div = num1 / num2;
        int modulus = num1 % num2;
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + div);
        System.out.println("Remainder: " + modulus);
        System.out.println(num3 + num4);
    
        System.out.println(a1 + a2);
    }
    
}
