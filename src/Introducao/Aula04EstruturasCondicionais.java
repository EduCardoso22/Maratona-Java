package Introducao;

public class Aula04EstruturasCondicionais {
    public static void main(String[] args) {

        int idade = 20;
        boolean autorizado = idade >= 18;
        if(autorizado) {
            System.out.println("Não pode beber.");
        }
        if (!autorizado) {
            System.out.println("Pode beber .");
        }

        int edu = 17;

        if (edu < 15) {
            System.out.println("Você é uma criança!");
        }

        else if (edu >= 15 && edu <= 17) {
            System.out.println("Você é um adolescente!");
        }
        else if (edu >= 18) {
            System.out.println("Você é um adulto!");
        }
    }
}

