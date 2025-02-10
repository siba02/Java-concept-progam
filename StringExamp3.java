public class StringExamp3 {
    public static void main(String[] args) {

        String s1=new String("Hello world");  //different object created in the heap area for s1 and s2.
        String s2=new String("Hello world");
        System.out.println(s1==s2);  // false

        String s3="Hello world";    //object created in the scp area.

        System.out.println(s1==s3); // false

        String s4="Hello world";

        System.out.println(s3==s4);  // true
        
        String s5="Hello"+" world"; //object created in the scp area.Because both these are constant.
        
        System.out.println(s4==s5);  // true

        String s6="Hello";

        String s7=s6+" world";  //object created in the heap area.
        
        System.out.println(s4==s7);  // false

        final String s8="Hello";
        
        String s9=s8+" world";  //object created in the scp area.
         
        System.out.println(s4==s9); //True
    }
    
}
