
class p{
    public void m1(){
        System.out.println("hello");
    }
}

class c extends p{
    public void m2(){
        System.out.println("world");
    }
}

public class IsaInheritance {
    public static void main(String[] args) {
        // p p1=new p();
        // p1.m1();
        // p1.m2();   //can't find symbol.

        c obj = new c();
        obj.m1();
        obj.m2();

        // p p2=new c();
        // p2.m1();
        // p2.m2();  //can't find symbol

        // c c1 =new p();   //incompatable type.

    }
    
}
