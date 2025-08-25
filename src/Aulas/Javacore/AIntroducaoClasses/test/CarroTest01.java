package Aulas.Javacore.AIntroducaoClasses.test;

import Aulas.Javacore.AIntroducaoClasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fusca";
        carro1.modelo = "Sport";
        carro1.ano = 1990;

        carro2.nome = "Megane";
        carro2.modelo = "Sei lá";
        carro2.ano = 2018;

        // para referenciar objetos: carro2 = carro1;

        System.out.println(carro1.nome + " " + carro1.ano + " " + carro1.modelo);
        System.out.println(carro2.nome + " " + carro2.ano + " " + carro2.modelo);

    }
}
