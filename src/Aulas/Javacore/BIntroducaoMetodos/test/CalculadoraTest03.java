package Aulas.Javacore.BIntroducaoMetodos.test;

import Aulas.Javacore.BIntroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double result = calculadora.divideDoisNumeros(10,5);

        System.out.println(result);

        calculadora.imprimeDivDoisNumeros(15,5);
    }
}
