package Introducao;

public class Aula03Operadores {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        System.out.println(num1 + num2);
        System.out.println(num2 - num1);
        System.out.println(num2 * num1);
        System.out.println(num2 / num1);

        //resto de divisão %

        int resto = 27 % 2;
        System.out.println(resto);

        // operadores lógicos: retornam booleano > < >= <= == !=

        boolean isDezMaiorQueVInte =  10 > 20;
        boolean isDezMenorQueVInte =  10 < 20;
        boolean isDezIgualQueVInte =  10 == 20;
        boolean isDezDiferenteQueVInte =  10 != 20;
        System.out.println(isDezMaiorQueVInte);
        System.out.println(isDezMenorQueVInte);
        System.out.println(isDezIgualQueVInte);
        System.out.println(isDezDiferenteQueVInte);

        // E (&&)  OU (||) NOT (!)

        int idade = 20;
        float salario = 1200;
        boolean isDentroDaLei = idade >=18 && salario >= 2000.21;
        System.out.println(isDentroDaLei);
        boolean verdade = true;
        System.out.println("Aqui a verdade é "+!verdade);
        boolean labubuCrianca = idade < 22 || salario < 1200;
        System.out.println("Labubu é de criança? " + labubuCrianca);

        // = += -+ *= /= %=

        double bonus = 1200;
        bonus += 1000; // 2200
        bonus -= 1000; // 200
        bonus /= 100; // 12
        bonus *= 100; // 120000
        bonus %= 2; // 0
        System.out.println(bonus);

        int contador = 0;
        contador++; // vê primeiro, soma depois
        System.out.println(contador);
        contador--;
        System.out.println(contador);
        ++contador; // soma primeiro, vê depois
        System.out.println(contador);
        --contador;
        System.out.println(contador);


    }
}
