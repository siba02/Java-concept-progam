public class BitwiseOperatiors {
    public static void main(String[] args) {
       
        int a = 5;  
        int b = 3;

        
        int andResult = a & b;  // Bitwise AND
        int orResult = a | b;   // Bitwise OR
        int xorResult = a ^ b;  // Bitwise XOR
        int notA = ~a;          // Bitwise NOT (complement of a)
        int notB = ~b;          // Bitwise NOT (complement of b)

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Bitwise AND of a & b: " + andResult);
        System.out.println("Bitwise OR of a | b: " + orResult);
        System.out.println("Bitwise XOR of a ^ b: " + xorResult);
        System.out.println("Bitwise NOT of a: " + notA);
        System.out.println("Bitwise NOT of b: " + notB);
    }
}

   