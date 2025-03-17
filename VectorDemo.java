import java.util.Vector;
public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector();
        System.out.println("Vector: " + v); //[]
        System.out.println("Vector: " + v.capacity()); //10
        for (int i = 0; i < 10; i++){
            v.addElement(i);
        }
        System.out.println("Vector: " + v); //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        v.add("A");

        System.out.println("Vector: " + v); //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A]
        System.out.println("Vector: " + v.capacity());  //20

        Vector v1=new Vector(1000,5);

        System.out.println("Vector: " + v1.capacity());  //1000




        
       
    }
    
}
