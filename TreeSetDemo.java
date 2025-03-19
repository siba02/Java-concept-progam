import java.util.TreeSet;
public class TreeSetDemo {
    public static void main(String[] args){
        TreeSet ts = new TreeSet();
        
        // ts.add("A");
        // ts.add("B");
        // ts.add("a");
        // ts.add("Z");
        // // ts.add(null);
        // // ts.add(new Integer(10));
        
        // System.out.println(ts); //[A,B,Z,a]

        ts.add(new StringBuffer("A"));
		ts.add(new StringBuffer("Z"));
		ts.add(new StringBuffer("L"));
		ts.add(new StringBuffer("B"));
		System.out.println(ts);     //We will get ClassCastException, If we are depending on Default Natural Sorting order compulsory the objects should be homogeneous & Comparable. Otherwise we will get RE: saying ClassCastException.

    }
    
}
