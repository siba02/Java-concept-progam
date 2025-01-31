// private class privatemodifiers {
//     public static void main(String[] args) {
//         System.out.println("hello");        
//     }
    
// }



// you can't give a top level class to private but can give the inner class as private.



 class privateModifiers2 {

    private int a=40;
 // Here the private value and method is accessable within the same class.

    private void m1(){
        System.out.println(a);
    }
    
    public static void main(String[] args) {
        privateModifiers2 pm = new privateModifiers2();
        pm.m1();
    }
}

