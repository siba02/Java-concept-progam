import java.util.*;

public class TreeMapDemo2 {
    public static void main(String args[]){
		TreeMap tm = new TreeMap(new MyComparator());
		tm.put("XXX", 10);
		tm.put("AAA", 20);
		tm.put("ZZZ", 30);
		tm.put("LLL", 40);
		
		System.out.println(tm);//{ZZZ=30, XXX=10, LLL=40, AAA=20}
		
	}
}

class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}

    
}
