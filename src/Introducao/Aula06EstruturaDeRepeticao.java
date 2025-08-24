package Introducao;

public class Aula06EstruturaDeRepeticao {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while (count < 10) {
            System.out.println("Contador é: " + count);
            count++;

        }
        for (int i = 0; i <= 1000000; i++) {
            if ( i % 2 == 0) {
                System.out.println("Número = " + i);
            }
        }
    }
}
