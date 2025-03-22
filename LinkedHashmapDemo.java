import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashmapDemo {
    public static void main(String[] args) {
        LinkedHashMap m = new LinkedHashMap();
        m.put("siba",100);
        m.put("tofan",800);
        m.put("talcher",900);
        m.put("manas",500);
        System.out.println(m);  //{siba=100, manas=500, talcher=900, tofan=800}
        System.out.println(m.put("siba",400)); //100

        Set s=m.keySet();
        System.out.println(s);//[siba, manas, talcher, tofan]

        Collection c=m.values();
        System.out.println(c); //[400, 500, 900, 800]

        Set s1=m.entrySet();
        System.out.println(s1); //[siba=400, manas=500, talcher=900, tofan=800]

        Iterator it=s1.iterator();
        while(it.hasNext()){
            Map.Entry m1=(Map.Entry)it.next();
            System.out.println(m1.getKey() +"-->"+ m1.getValue());

            if(m1.getKey().equals("siba")){
                m1.setValue(500);
            }
        }
        System.out.println(m); //{siba=500, manas=500, talcher=900, tofan=800}

        
    }
    
}
