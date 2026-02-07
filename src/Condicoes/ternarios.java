package Condicoes;

import java.util.Scanner;

public class ternarios {
    static void main(String[] args) {
        Scanner inputUsuario = new Scanner(System.in);

        short idade = inputUsuario.nextShort();
        String maiorDeIdade = (idade>=18) ? "É MAIOR de idade" : "É MENOR de idade";

        System.out.println(maiorDeIdade);
        inputUsuario.close();
    }
}
