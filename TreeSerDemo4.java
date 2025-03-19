import java.util.Comparator;
import java.util.TreeSet;

public class TreeSerDemo4 {
    public static void main(String args[]){
		TreeSet ts = new TreeSet(new MyComparator());
		ts.add("Rakesh");
		ts.add("Sushil");
		ts.add("Ravi");
		ts.add("Govind");
		ts.add("Raju");
		System.out.println(ts);
	}
}

class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
		String s1 = (String) obj1;
		String s2 = (String) obj2;
		// return s1.compareTo(s2); //Default natural sorting order (Ascending order)[Govind, Raju, Rakesh, Ravi, Sushil].
        // return -s1.compareTo(s2);  //Descending order [Sushil, Ravi, Rakesh, Raju, Govind].
		// return s2.compareTo(s1);  //Descending order [Sushil, Ravi, Rakesh, Raju, Govind].
        // return -s2.compareTo(s1);  //Ascending order[Govind, Raju, Rakesh, Ravi, Sushil].
        // return 1; //[Rakesh, Sushil, Ravi, Govind, Raju] as it is because it check obj1 has to come after obj2 always (intertion order).
        // return -1; //[Raju, Ravi, Rakesh, Sushil, Govind] as it is because it check obj1 has to come before obj2 always (reverse intertion order).
        return 0; // only first element will be inserted all are remaining 0.[Rakesh].

	}
}


    

