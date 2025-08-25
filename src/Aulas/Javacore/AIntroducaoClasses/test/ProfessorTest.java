package Aulas.Javacore.AIntroducaoClasses.test;

import Aulas.Javacore.AIntroducaoClasses.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Kageyama";
        professor.sexo = 'M';
        professor.idade = 23;

        System.out.println("Nome: " + professor.nome + ";\nSexo: " + professor.sexo + "; \nIdade: " + professor.idade + ".");
    }
}
