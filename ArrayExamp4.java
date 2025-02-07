public class ArrayExamp4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int clonearr[]=arr.clone();   //.clone() creates a new array that is an exact copy of the original but stored at a different memory location.

        //  clone() creates a new array, clonearr and arr are stored at different memory addresses.
        // Therefore, clonearr == arr evaluates to false.


        System.out.println(clonearr==arr);  //deep cloning
        
    
        
    }
    
}
