public class DIm{
    public static void main(String[] args) {
        int mat[][] = { {10, 20, 30, 40, 50, 60, 70, 80, 90},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50, 51, 89},
              };


        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[i].length; j++) {
                System.out.println("Values at arr["+i+"]["+j+"] is "+mat[i][j]);
            }
        }
    }
}
