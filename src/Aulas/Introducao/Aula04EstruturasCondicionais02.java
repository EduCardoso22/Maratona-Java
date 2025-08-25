package Aulas.Introducao;

public class Aula04EstruturasCondicionais02 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 100 para alguém!";
        String mensagemNaoDoar = "Eu ainda não consigo doar...";
        String resultado = (salario > 3000) ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
