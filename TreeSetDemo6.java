
import java.util.Comparator;
import java.util.TreeSet;

class Employee implements comparable{
	
	String name;
	int id;
	
	Employee(String name, int id){
		this.name = name;
		this.id = id;
	}

	public String toString(){
		return name+"-->"+id;
	}

	public int compareTo(Object obj){

		int id1 = this.id;
		Employee e = (Employee) obj;
		int id2 = e.id;
		if(id1 > id2){
			return 1;
		}else if(id1 < id2)
			return -1;
		else
			return 0;
	}
}

public class TreeSetDemo6{

	public static void main(String args[]){

		Employee e1 = new Employee("A", 100);
		Employee e2 = new Employee("B", 200);
		Employee e3 = new Employee("C", 50);
		Employee e4 = new Employee("D", 150);
		Employee e5 = new Employee("E", 100);
		
		// TreeSet ts = new TreeSet();
		// ts.add(e1);
		// ts.add(e2);
		// ts.add(e3);
		// ts.add(e4);
		// ts.add(e5);
		
		// System.out.println(ts);
		
		TreeSet ts2 = new TreeSet(new MyComp());
		ts2.add(e1);
		ts2.add(e2);
		ts2.add(e3);
		ts2.add(e4);
		ts2.add(e5);
		
		System.out.println(ts2);
	}
}

class MyComp implements Comparator{

	public int compare(Object obj1, Object obj2){
		Employee e1 = (Employee) obj1;
		Employee e2 = (Employee) obj2;
		
		String s1 = e1.name;
		String s2 = e2.name;
		
		return s1.compareTo(s2);
	}

}