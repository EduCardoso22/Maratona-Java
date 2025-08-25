package Aulas.Javacore.BIntroducaoMetodos.dominio;

public class Calculadora {

    public void somaDoisNumeros () {
        System.out.println(20+20);
    }
    public void subtraiDoisNumeros () {
        System.out.println(20-10);

    }

    public void multiplicaDoisNumeros (int num1, float num2) {
        System.out.println(num1*num2);

    }

    public double divideDoisNumeros (double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1/num2;
    }
    // O de baixo só faz com que a divisão seja realizada se num2 != 0. dava pra fazer o oposto também.
    public double divideDoisNumeros02 (double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        else {
            return num1/num2;
        }
    }
    public void imprimeDivDoisNumeros (double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por 0!");
        }
        else {
            System.out.println(num1/num2);
        }
    }
}
