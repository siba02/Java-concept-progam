package pack1;
public class C{
    protected void x1(){
        System.out.println("This is protected modifiers");

    }
}

class D extends C{
    public static void main(String[] args) {
        C c = new C();
        c.x1();

        D d = new D();  
        d.x1(); 

        C c2 = new D();
        c2.x1(); //allowed because D is subclass of C and C is public.


    }
}
    

