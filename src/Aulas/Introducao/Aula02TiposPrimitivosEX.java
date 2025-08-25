package Aulas.Introducao;

public class Aula02TiposPrimitivosEX {

    public static void main(String[] args) {
        String nome = "Eduardo";
        String endereco = "Rua Braraá, 69";
        double salario = 1999.99;
        String dataSalario = "22-12-2323";

        //System.out.println("Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de "+salario+", na data de "+dataSalario+".");

        String relatorio = "Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de " + salario + " na data " + dataSalario + ".";
        System.out.println(relatorio);

    }
}
