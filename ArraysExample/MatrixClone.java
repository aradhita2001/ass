package ArraysExample;

public class MatrixClone {

    private static void print (int[][] matrix){
        for(int[] row : matrix){
            for(int i : row){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
    public static void main(String[] args) {
        
        int[][] matrix1 = {{1,2,3}, {4,5,6}};

        int[][] matrix2 = matrix1.clone();

        print(matrix1);
        print(matrix2);

        matrix1[1][2] = 0;
        print(matrix1);
        print(matrix2);

        int[] newRow = {7,8,9};
        matrix1[0] = newRow;

        print(matrix1);
        print(matrix2);


    }
}
