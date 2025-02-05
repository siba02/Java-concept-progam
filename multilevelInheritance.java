class k{
    public void m1(){
        System.out.println("hello");
    }
}

class m extends k{
    public void m2(){
        System.out.println("world");
    }
}

class n extends m{
    public void m3(){
        System.out.println("java");
    }
}

public class multilevelInheritance {
    public static void main(String[] args) {
        n obj=new n();
        obj.m1();
        obj.m2();  //prints world
        obj.m3();  //prints java
    }
}
