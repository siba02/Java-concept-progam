class student{
    int id;
    String name;

    student(int id, String name){       //constructor
        this.id = id;
        this.name = name;
    }
}
public class constructor {
    public static void main(String[] args) {
        student s1=new student(10,"siba");
        student s2=new student(11,"sibu");
        System.out.println(s1.id + " " + s1.name);
        System.out.println(s2.id + " " + s2.name);
    }

    
}
