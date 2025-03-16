
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        list.add(1);
        list.add("siba");
        list.add(null);
        list.add(4);
        
        System.out.println("Original List: " + list); //[1, siba, null, 4]
        list.set(0,"hello");
        list.add(3,"mango");
        System.out.println("Modified List: " + list);//[hello, siba, null, mango, 4]
        
        list.remove(2);
        
        System.out.println("Modified List: " + list);//[hello, siba, null, mango, 4]
        list.addFirst("tofan");
        System.out.println("Modified List: " + list);//[tofan, hello, siba, mango, 4]
    }
    
}
