public class foreachloop {
    public static void main(String[] args) {
        int [][] x={{10,20,30},{40,50}};

        // for(int i=0; i<x.length; i++) {
        //     for(int j=0; j<x[i].length; j++) {
        //         System.out.print(x[i][j]+" ");
        //     }
        // }

        for(int[]x1:x){
            for(int x2:x1){
                System.out.print(x2+" ");
            }
        }

  }
}