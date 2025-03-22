
import java.util.*;

public class WeakHashmapDemo {
    public static void main(String[] args) {
       
            WeakHashMap hm = new WeakHashMap();
            Temp t = new Temp();
            hm.put(t, "abc");
            System.out.println(hm);
            t=null;
            System.gc();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException ex) {

        }
            System.out.println(hm);
        }
    }
    
    class Temp{
        public String toString(){
            return "temp";
        }
        public void finalize(){
            System.out.println("Finalize method called");
        }
    
    }
    

