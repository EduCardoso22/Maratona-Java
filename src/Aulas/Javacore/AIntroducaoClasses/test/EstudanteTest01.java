package Aulas.Javacore.AIntroducaoClasses.test;

import Aulas.Javacore.AIntroducaoClasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.idade = 22;
        estudante.sexo = 'M';
        estudante.nome = "Eduardo";
        System.out.println("Olá, eu sou o " + estudante.nome + ". Tenho " + estudante.idade + " anos. Sou do sexo " + estudante.sexo);

    }
}
