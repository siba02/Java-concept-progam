 class Logicaloperators {
    public static void main(String args[]){
        boolean a = true, b = false;
        
        System.out.println(a && b); // false
        System.out.println(a || b); // true
        System.out.println(!a); // false
        System.out.println(a ^ b); // true
        System.out.println(a && b || a ^ b); // true
    }
    
}