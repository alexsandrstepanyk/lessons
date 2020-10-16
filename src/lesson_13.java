import org.w3c.dom.ls.LSOutput;

public class lesson_13 {
    public static void main(String[] args) {
        int[] numbers ={1,2,3};
        System.out.println(numbers[1]); // одномерний масив
        int [][] matrice ={{1,2,3},     // двомерний масив
                            {4,5,6},
                            {7,8,9}};
        System.out.println(matrice[2][2]);
        System.out.println(matrice[0][0]);
        int [][] matrice1 ={{1,2,3,6,8,15,98},     // двомерний масив
                {4},
                {7,9}};
        System.out.println(matrice[2][2]);
        System.out.println(matrice[0][0]);
        System.out.println(matrice1[0][5]);

        String[][] strings = new String[2][3];
        strings[0][1] = "hi";
        System.out.println(strings[0][1]);
        int[][] matrix ={{34,12,11},
                {13,32,47},
                {11,22,33}};
            for (int i=0; i<matrix.length; i++){
                for (int j=0; j<matrix[i].length; j++){
                    System.out.print(matrix[i][j] + " ");
                }

        System.out.println();
            }
    }
}

