abstract class S {
    public abstract void m1();
    public abstract void m2();
    public abstract void m3();
}

abstract class P extends S{   
    public void m1() {
        System.out.println("Hello");
    }
    public void m2() {
        System.out.println("World");
    }
    public abstract void m3(); // must be implemented in subclass
}

// C is now an independent concrete class
class C extends P {  
    public void m3() {
        System.out.println("Java");
    }
}

public class Abstractexmp {
    public static void main(String[] args) {
        C x = new C();  // Now works because C is independent
        x.m1();
        x.m2();
        x.m3();  // Calls the m3 method in C
    }
}
