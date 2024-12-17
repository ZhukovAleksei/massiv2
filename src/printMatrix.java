
public class printMatrix {
    public static void printMatrix(int[][] mas) {
        for (int[] row : mas) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
