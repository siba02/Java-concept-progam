public class ArreyExmp1 {
    public static void main(String[] args) {
        int[] array;      //declaration
         array=new int[10];   //initialization with default value 0.
        System.out.println(array[0]);

        int[] array2 = new int[] {10,20,30,40,50,60};
        System.out.println(array2[5]);
        
        // for(int i=0;i<array2.length;i++){           //traditional for loop
        //     System.out.print(array2[i]+",");
        // }

        for(int x:array2){              //for-eachloop
            System.out.print(x+",");
        }

    }
}
