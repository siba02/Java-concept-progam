import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String args[]){
		TreeMap tm = new TreeMap();
		tm.put(100, "ZZZ");
		tm.put(103, "YYY");
		tm.put(101, "XXX");
		tm.put(104, "106");
		
		// tm.put("FFF", "xxx"); //CCE
		// tm.put(null, "xxx");//NPE
		
		System.out.println(tm);
		
	}
}

    
    

