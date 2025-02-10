public class StringExamp5 {
    public static void main(String[] args) {

         String s=new String(); //create an empty string object.
        //  String s1=new String(String literal);   //for the given string literals create a string object.
        //  String s2=new String(StringBuffer sb); //for the given stringBuffer create a string object.
        //  String s2=new String(StringBuilder sb1); //for the given stringBuilder create a string object.

        char[] ch ={'T','O','F','A','N'};
        String s3=new String(ch);
        System.out.println(s3);

        byte[] b={97,98,99,100,101};
        String s4=new String(b);
        System.out.println(s4);
    }
    
}
