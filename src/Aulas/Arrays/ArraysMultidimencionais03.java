package Aulas.Arrays;

public class ArraysMultidimencionais03 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};

        int[][] dias = new int[3][];

        dias[0]= new int [4];
        dias[1] = array;
        dias[2] = new int []{1,2,3,4,5};

        // o array int[][] = arrayInt2 {{0,0},{1,2,3},{1,2,3,4,5,6}}; é, basicamente, um array que tem 3 posições e, dentro da 1 tem 2 espaços, da 2 tem 3 espaços e do 3 tem 6 espaços.

        for (int[] arrBase: dias) {
            System.out.println("\n---");
            for (int i : arrBase) {
                System.out.print(i + " ");
            }
        }



    }
}
