package Aulas.Javacore.BIntroducaoMetodos.test;

import Aulas.Javacore.BIntroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros(); //executar o método
        calculadora.subtraiDoisNumeros();
    }
}
