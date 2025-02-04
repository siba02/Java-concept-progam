 class Employee{
    private int id;
    private String name;


    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }    
  public void setId(int id){
    this.id = id;
}
 public int getId(){
    return id;
 }

 public void setName(String name){
    this.name = name;
}
 public String getName(){
    return name;
 }
}

public class Encapsulate {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "John Doe");
        Employee emp2 = new Employee(2, "Michael Doe");

        String empname = emp.getName();
        System.out.println("Employee Name: " + empname);
        int empid = emp.getId();
        System.out.println("Employee ID: " + empid);
        
        
    }
    
}
