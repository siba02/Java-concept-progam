public class trymultiplecatch {
    public static void main(String[] args) {
     System.out.println("hello");
     m1();   
    }
        static void m1(){
            try{
                System.out.println(10/0);               //happen internally by the main method.
                throw new NullPointerException();      //Explicitly throw exception.
             }catch(NullPointerException e){
                System.out.println("Null Pointer Exception occurred");
            }catch(ArithmeticException e){
                System.out.println("Arithmetic Exception occurred");
            }catch(Exception e){
                System.out.println("General Exception occurred");
            // }  catch(ArithmeticException e){
            //     System.out.println("Arithmetic Exception occurred");   
}
}
}