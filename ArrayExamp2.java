public class ArrayExamp2 {

    public static int[] get(){
        // int[] arr = new int[]{1,2,3,4,6};  //anonymous array.
        // int[] arr = {1,2,3,4,6};  

        // return arr;
       return new int[]{1,2,3,4,6,7};     //also anonymous array.

    }
    public static void main(String[] args){
        int res[]=get();
        for(int i=0; i<res.length; i++){
       System.out.print(res[i]+",");

    }
    
}
}
