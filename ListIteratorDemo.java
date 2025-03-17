import java.util.*;

public class ListIteratorDemo {
    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.add("a");
        li.add("siba");
        li.add("tofan");
        li.add("talcher");
        
        System.out.println("Original List: " + li); //[a, siba, tofan, talcher]
        ListIterator ltr= li.listIterator();
        while(ltr.hasNext()) {
            String s = (String)ltr.next();
            if(s.equals("siba")) {
                ltr.set("sibu");
            }
            else if(s.equals("tofan")) {
                ltr.add("tofu");
            }
            else if(s.equals("talcher")) {
                ltr.remove();
            }
            
        
    }
    System.out.println(li); 
    
}
}
