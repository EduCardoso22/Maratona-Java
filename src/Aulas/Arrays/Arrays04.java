package Aulas.Arrays;

public class Arrays04 {
    public static void main(String[] args) {
        int [] numeros = new int[3];
        int [] numeros2 = {1,2,3,4,5};
        int [] numeros3 = new int[] {1,2,3,4,5,6,7};
        for (int i = 0; i < numeros.length ; i++) {
            System.out.println(numeros[i]);

        }
        for (int i:numeros2){
            System.out.println(i);
        }
    }
}
