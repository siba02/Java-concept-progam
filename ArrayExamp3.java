public class ArrayExamp3 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},{ 4, 5,6},{ 7, 8, 9}};

        // for (int i=0;i<3;i++) {
        //     for (int j=0;j<3;j++) {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();  // Moves to the next line after printing one row
        // }
        

        for (int[]x:arr){
            for(int x1:x){
                System.out.print(x1+" ");
            }
            System.out.println();
        }
        
    
}
}
