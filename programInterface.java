interface demo{
     void m1();
    void m2();
}


abstract class demo2 implements demo{              //if we didn't implement the 2nd method then we have to daclare the class as abstract.
    public void m1() {                   // the interface method is always  public while implementing otherwise get compile time error.
        System.out.println("this is method m1");
    }
}
class demo3 extends demo2{
    
    public void m2() {
        System.out.println("this is method m2");
    }
}



public class programInterface {
    public static void main(String[] args) {
        demo3 obj = new demo3();
        obj.m1();
        obj.m2();
    }
    
}
