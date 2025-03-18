import java.util.TreeSet;
public class TreeSetDemo {
    public static void main(String[] args){
        TreeSet ts = new TreeSet();
        
        ts.add("A");
        ts.add("B");
        ts.add("a");
        ts.add("Z");
        // ts.add(null);
        // ts.add(new Integer(10));
        
        System.out.println(ts); //[A,B,Z,a]
    }
    
}
