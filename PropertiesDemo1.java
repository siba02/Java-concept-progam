import java.util.Properties;

public class PropertiesDemo1 {
    public static void main(String[] args) {
        Properties prop = new Properties();
        
        prop.setProperty("name", "John Doe");
        prop.setProperty("age", "30");
        prop.setProperty("city", "New York");
        
        System.out.println(prop);
    }
    
}
