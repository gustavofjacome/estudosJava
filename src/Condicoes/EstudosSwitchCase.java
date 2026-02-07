package Condicoes;

import java.util.Scanner;

public class EstudosSwitchCase {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("1 - Gustavo");
        System.out.println("2 - Laura");
        System.out.println("3 - Piuba");

        int inputUsuario = scanner.nextInt();

        switch (inputUsuario){
            case 1:
                System.out.println("Você escolheu o gustavo");
                break;
            case 2:
                System.out.println("Você escolheu laura");
                break;
            case 3:
                System.out.println("Você escolheu piuba");
                break;
            default:
                System.out.println("Escolha um número de 1 a 3");
        }
        scanner.close();
    }






}
