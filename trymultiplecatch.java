public class trymultiplecatch {
    public static void main(String[] args) {
     System.out.println("hello");
     m1();   
    }
        static void m1(){
            try{
                System.out.println(10/0);
                throw new NullPointerException();
            }catch(ArithmeticException e){
                System.out.println("Arithmetic Exception occurred");

            }catch(NullPointerException e){
                System.out.println("Null Pointer Exception occurred");
                
            }catch(Exception e){
                System.out.println("General Exception occurred");
            // }  catch(ArithmeticException e){
            //     System.out.println("Arithmetic Exception occurred");   
}
}
}