import java .util.  HashSet;
public class HashsetDemo {
    public static void main(String[]args){
        
        HashSet hs = new HashSet();
        hs.add("Apple");
        hs.add("Banana");
        hs.add(10);
        hs.add(null);
        hs.add("k");
        System.out.println(hs.add(10)); // false
        System.out.println(hs);          //[null, Apple, 10, k, Banana]
    }
}
