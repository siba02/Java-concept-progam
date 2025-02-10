class G{
    public void show(){
        System.out.println("G show");
    }
    
   public void display(){
        System.out.println("G display");
    }
}

class H extends G{
     public void show(){
        System.out.println("H show");
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        G g = new G();
        g.show(); // G show

        H h = new H();
        h.show(); // H show

        G g1= new H();   //parent reference child object print the child method.
        g1.show(); //H show
    }
    
}
