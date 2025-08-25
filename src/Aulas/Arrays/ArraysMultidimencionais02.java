package Aulas.Arrays;

public class ArraysMultidimencionais02 {
    public static void main(String[] args) {
        int[][] dias = new int [2][2];
        dias[0][0] = 1;
        dias[0][1] = 2;
        dias[1][0] = 1;
        dias[1][1] = 2;

        for (int[] arrBase: dias) {
            for (int num: arrBase) {
                System.out.print(num + " ");
            }
        }


    }
}
