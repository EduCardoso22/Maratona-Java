package Aulas.Arrays;

public class ArraysMultidimencionais01 {
    public static void main(String[] args) {
        // 1,2,3,4,5 meses
        //31,28,31,30,31 dias
        int [][] dias = new int[2][2];
        dias [0][0] = 31;
        dias [0][1] = 29;
        dias [1][0] = 30;
        dias [1][1] = 31;
        // System.out.println(dias[0][1]);

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.print(dias[i][j] + " ");

            }

        }

    }
}
