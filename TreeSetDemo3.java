import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String args[]){
		TreeSet ts = new TreeSet(new MyComparator());
		ts.add(10);
		ts.add(0);
		ts.add(15);
		ts.add(5);
		ts.add(20);
		ts.add(20);
		System.out.println(ts); // 20, 15, 10, 5, 0
	}
}

class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
		Integer i1 = (Integer) obj1;
		Integer i2 = (Integer) obj2;
		if(i1 < i2)
			return 1;
		else if(i1 > i2)
			return -1;
		else
			return 0;
	}
}

    

