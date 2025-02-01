public class staticmodifiers {
    
        int x=10;
        static int y=20;
    
    public  void m1() {
        System.out.println(x); 
        System.out.println(y); 
    }
    
    public static void m2(){
        // System.out.println(x);
        int z=30; 
        System.out.println(y); 
        System.out.println(z);
        
    }
    
    public static void main(String[] args) {
        staticmodifiers a = new staticmodifiers();
        a.m1(); 
        staticmodifiers.m2();
    }
    
    }   
    

