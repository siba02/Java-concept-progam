
    public class Exnesteddowhile {
        public static void main(String[] args) {
            int outer = 1;
            int inner;
    
           
            do {
                System.out.println("Outer loop iteration: " + outer);
    
                
                inner = 1;
    
                
                do {
                    System.out.println("    Inner loop iteration: " + inner);
                    inner++;
                } while (inner <= 3); // Inner loop condition
    
                outer++;
            } while (outer <= 2); // Outer loop condition
        }
    }
    
    

