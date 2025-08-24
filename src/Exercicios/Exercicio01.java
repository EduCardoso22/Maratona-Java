package Exercicios;

public class Exercicio01 {
    public static void main(String[] args) {
        double salario = 7000;
        double imposto;

        if (salario  <= 34712) {
            imposto = salario * 0.097;
            System.out.println("Você irá pagar " + imposto + " de imposto, pois seu salário é de " + salario);
        }
        else if (salario > 34712 && salario <= 68507) {
            imposto = salario * 0.3735;
            System.out.println("Você irá pagar " + imposto + " de imposto, pois seu salário é de " + salario);
        }
        else {
            imposto = salario * 0.4950;
            System.out.println("Você irá pagar " + imposto + " de imposto, pois seu salário é de " + salario);
        }
    }
}
