import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[]args){
        
        LinkedHashSet hs = new LinkedHashSet();
        hs.add("Apple");
        hs.add("Banana");
        hs.add(10);
        hs.add(null);
        hs.add("k");
        System.out.println(hs.add(10)); // false
        System.out.println(hs);          //[Apple,Banana,10,Null,k]
    }
    
}
