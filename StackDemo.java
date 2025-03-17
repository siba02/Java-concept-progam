import java.util.Stack;
public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("A");
        s.push("B");
        s.push("C");
        System.out.println(s);
        System.out.println(s.pop());  // return the top of stack  and remove from the stack.  c
        System.out.println(s);
        System.out.println(s.peek()); //return the top of the stack without removing the stack.
        System.out.println(s);
        System.out.println(s.search("A"));  //return offset. 2
        System.out.println(s.search("D")); // return -1 if element not found.



    }
    
}
