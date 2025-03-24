import java.util.*;

public class HashTableDemo {
    public static void main(String args[]){
		Hashtable h = new Hashtable();
		h.put(new Temp(5), "A");
		h.put(new Temp(2), "B");
		h.put(new Temp(6), "C");
		h.put(new Temp(15), "D");
		h.put(new Temp(23), "E");
		h.put(new Temp(16), "F");
		
		// h.put("abc", null); //NPE
		
		System.out.println(h);
		
	}
}

class Temp{
	int i;
	 Temp(int i){
		this.i=i;
	}
	public int hashCode(){
		return i;
	}
	public String toString(){
		return i+"";
	}

    
}
