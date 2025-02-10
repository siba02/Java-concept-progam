public class StringExamp4 {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.substring(6, 11)); // Output: World
        System.out.println(str.charAt(3)); //l
        System.out.println(str.indexOf('l')); // Output: 2 (give the first appearaance).
        System.out.println(str.concat(" Java")); //Hello World Java.
        System.out.println(str.length()); //11
        System.out.println(str.isEmpty()); //false
        System.out.println(str.replace("o","d"));

    }
    
}
