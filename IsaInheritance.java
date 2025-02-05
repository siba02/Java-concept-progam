
class T{
    public void m1(){
        System.out.println("hello");
    }
}

class u extends T{
    public void m2(){
        System.out.println("world");
    }
}

public class IsaInheritance {
    public static void main(String[] args) {
        // T p1=new T();
        // p1.m1();
        // p1.m2();   //can't find symbol.

        u obj = new u();
        obj.m1();
        obj.m2();

        // T p2=new u();
        // p2.m1();
        // p2.m2();  //can't find symbol

        // u c1 =new T();   //incompatable type.

    }
    
}
