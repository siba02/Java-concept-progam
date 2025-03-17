
    import java .util.*;
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList li = new ArrayList();
        for(int i=0;i<=10;i++){
            li.add(i);
        }
        System.out.println(li);
        Iterator itr=li.iterator(); //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        while(itr.hasNext()){
            Integer I=(Integer)itr.next();
            if(I%2==0)
                System.out.println(I); //0 2 4 6 8 10
            else
                itr.remove(); //To remove the odd number from the ArrayList
            }
            System.out.println(li); //[0, 2, 4, 6, 8, 10]
        }
        

        
    }
    

    

