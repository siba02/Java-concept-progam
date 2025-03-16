
    import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();   //Default size is 10.
        al.add("A");
        al.add("Mango");
        al.add("A");
        al.add("80");
        System.out.println(al);            //[A, Mango, A, 80]
        al.remove(2);
        System.out.println(al);             //[A, Mango, 80]        
        al.add(1, "Apple");   
        System.out.println(al);             //[A, Apple, Mango, 80]
        al.set(3, "Orange");  
        System.out.println(al);             //[A, Apple, Mango, Orange]
        al.add(null);
        System.out.println(al);             //[A, Apple, Mango, Orange, null]


        System.out.println(al.get(2)); 

        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+",");
        }
    }

    

    
    
}

    

