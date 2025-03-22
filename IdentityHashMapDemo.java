import java.util.IdentityHashMap;

public class IdentityHashMapDemo{
    public static void main(String[] args) {
        // HashMap m1 = new HashMap();
IdentityHashMap m2 = new IdentityHashMap();

Integer i1 = new Integer(10);
Integer i2 = new Integer(10);

m2.put(i1, "Rama");
m2.put(i2, "Hari"); 

System.out.println(m2);//10=Rama,10=Hari


    }

    
}
