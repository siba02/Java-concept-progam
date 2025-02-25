public class trycatchException {
    public static void main(String[] args) {
     System.out.println("hello");
     try {
         System.out.println("welcome");
         System.out.println(10/0);
         System.out.println("this is an exception");
     } catch (RuntimeException e) {
        System.out.println("exception handled");
        e.printStackTrace();      //print the name of exception,Description and stack trace information.
        System.out.println(e.getMessage());  //print the Description of the exception.
        System.out.println(e.toString());   //print the name of exception,Description.
        

     }   
    }
}
