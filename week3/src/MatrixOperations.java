public class MatrixOperations {

    static int[] rowSums(int[][] matrix) {
        int[] sum = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum[i] += matrix[i][j];
            }
        }

        return sum;
    }

    static int[] columnSums(int[][] matrix) {
        int[] sums = new int[matrix[0].length];

        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                sums[j] = sums[j] + matrix[i][j];
            }
        }

        return sums;
    }

    static int[][] add(int[][] first, int[][] second) {
        int[][] result = new int[first.length][first[0].length];

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[i].length; j++) {
                result[i][j] = first[i][j] + second[i][j];
            }
        }

        return result;
    }


    static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] result = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    static int[][] multiply(int[][] first, int[][] second) {
        int[][] result = new int[first.length][second[0].length];

        for (int row = 0; row < first.length; row++) {
            for (int column = 0; column < second[0].length; column++) {
                int sum = 0;
                for (int i = 0; i < second.length; i++) {
                    sum = sum + first[row][i] * second[i][column];
                }
                result[row][column] = sum;
            }
        }
        return result;
    }

    static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    }

