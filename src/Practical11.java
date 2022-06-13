import java.util.Scanner;

public class Practical11 {


    public static void main(String[] args) {

        int[][] my_matrix;
        int i, j, count;
        my_matrix = Fuctions.create_fill_matrix();
        Fuctions.displayMatrix(my_matrix);
        System.out.println("\n Row's having odd number of 1");
        for (i = 0; i < 6; ++i) {
            count = 0;
            for (j = 0; j < 6; j++) {
                if (my_matrix[i][j] == 1) {
                    count++;
                }

            }
            if (count % 2 != 0) {
                System.out.println("Row -" + (i + 1) + " have odd number of 1's");
            }
        }
        System.out.println("\n Colums having odd number of 1");
        for (i = 0; i < 6; ++i) {
            count =0;
            for (j=0;j<6;++j){
                if (my_matrix[j][i]==1){
                    count++;
                }
            }
            if (count % 2 != 0){
                System.out.println("Colum -" + (i + 1) +" have odd number of 1's");
            }
        }
    }


    public class Fuctions {
        public static int[][] create_fill_matrix() {
            int[][] matrix = new int[6][6];
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    matrix[i][j] = (int) ((Math.random() * 5) % 2);
                }
            }
            return matrix;
        }

        public static void displayMatrix(int[][] matrix) {
            System.out.print("\nMatrix Values \n");
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }



}







