package pack2;

import pack1.C;

 class E extends C {
    public static void main(String[] args) {
        // A a=new A();
        // a.x1(); // Error: The method x1() is protected in C

        E e=new E();
        e.x1(); // No error: The method x1() is public in C

        // A a1=new A();
        // a1.x1(); // Error: The method x1() is protected in C
    }

    
    
}
