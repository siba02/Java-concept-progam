public class StringExamp1 {
    public static void  main(String[] args){
        // String s=new String("hello");   //string is immutable so once we create string object we can't perform any changes in it.
        //  s.concat("world");    //a new object will be created at the heap area,as we didn't assign the value to any variable it is eligible for garbage collection.
        //  String s2=s.concat("world"); 
        // System.out.println(s2);    //this non-changable behavior is called immutability.


        StringBuffer sb=new StringBuffer("java");
        sb.append("course");
        System.out.println(sb);    //this changable behavior is called mutable.
    
    }
    
    
}
