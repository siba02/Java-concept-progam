public class StringExamp4 {
    public static void main(String[] args) {
        String str = "Hello World ";
        System.out.println(str.substring(6, 11)); // Output: World
        System.out.println(str.charAt(3)); //l
        System.out.println(str.indexOf('W')); // Output: 2 (give the first appearaance).
        System.out.println(str.concat(" Java")); //Hello World Java.
        System.out.println(str.length()); //11
        System.out.println(str.isEmpty()); //false
        System.out.println(str.replace("o","d"));
        System.out.println(str.trim());  //remove the space before and after the string (not middle).
        System.out.println(str.toUpperCase()); //HELLO WORLD
        System.out.println(str.toLowerCase()); //hello world
    }
    
}
