// public class throwexception3 {
//     public static void main(String[] args) {
//         throw new Test();
//     }
// }
     //RE-incompatible types: Test cannot be converted to Throwable.






     
public class throwexception3 extends RuntimeException {
    public static void main(String[] args) {
        throw new throwexception3();
    }
}
    //RE-Exception in thread "main" throwexception3.