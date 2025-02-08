public class StringExamp2 {

    public static void main(String[] args) {
        // String s1=new String("Hello");
        // String s2=new String("Hello");
        // System.out.println(s1==s2);      // (false) the == operator always check for the reference comparison.
        // System.out.println(s1.equals(s1));   // (true) in string the equals method is overridden.

        StringBuffer sb1=new StringBuffer("Hello");
        StringBuffer sb2=new StringBuffer("Hello");
        System.out.println(sb1==sb2);   //false
        System.out.println(sb1.equals(sb2));  // (false) in string the equals method is not overridden.


      

    
}
}
