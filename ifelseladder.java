import java.util.*;


public class ifelseladder {
    public static void main (String[] args){
       Scanner mark=new Scanner(System.in);
       
       System.out.println("Enter your score: ");
       int score=mark.nextInt();
     
        
        if(score >= 90){
            System.out.println("Grade: A");
        } else if(score >= 80){
            System.out.println("Grade: B");
        } else if(score >= 70){
            System.out.println("Grade: C");
        } else if(score >= 60){
            System.out.println("Grade: D");
        } else{
            System.out.println("Grade: F");
        }

    }

    
}
