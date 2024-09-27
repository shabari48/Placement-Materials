public class diagprint {
        public static void main(String[] args) {
            int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
            };
            int num = 11;
            printDiagonal(matrix, num);
        }
    
        public static void printDiagonal(int[][] matrix, int num) {
            int[] position = findNumber(matrix, num);
            if (position == null) {
                System.out.println("Number " + num + " not found in the matrix.");
                return;
            }
    
            int row = position[0];
            int col = position[1];
            if (num % 2 == 0) {  // num is even
                while (row > 0 && col < matrix[0].length - 1) {
                    row--;
                    col++;
                }
    
                while (row < matrix.length && col >= 0) {
                    System.out.print(matrix[row][col] + " ");
                    row++;
                    col--;
                }
            } else {  // num is odd
                while (row > 0 && col > 0) {
                    row--;
                    col--;
                }
    
                while (row < matrix.length && col < matrix[0].length) {
                    System.out.print(matrix[row][col] + " ");
                    row++;
                    col++;
                }
            }
        }
    
        public static int[] findNumber(int[][] matrix, int num) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == num) {
                        return new int[]{i, j};
                    }
                }
            }
            return null;
        }
    }
    
