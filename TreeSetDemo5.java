import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo5 {
    public static void main(String args[]){
		TreeSet ts = new TreeSet(new MyComparator());
		ts.add("A");
		ts.add(new StringBuffer("ABC"));
		ts.add(new StringBuffer("AA"));
		ts.add("xx");
		ts.add("ABCD");
		ts.add("A");
		System.out.println(ts);//[A, AA, XX, ABC, ABCD]
	}
}

class MyComparator implements Comparator{
	
public int compare(Object obj1, Object obj2){
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		int i1 = s1.length();
		int i2 = s2.length();
		if(i1 > i2){
			return 1;
		}else if(i1 < i2){
			return -1;
		}else return s1.compareTo(s2);  //if write return 0 here xx is not going to print because samelength as AA.
	}

    
}
