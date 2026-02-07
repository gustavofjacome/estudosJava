package exercicios;

import java.util.Scanner;


public class ex1 {
    static void main(String[] args) {

        //Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
        // antecessor e seu sucessor.

        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        int antecessor = numero-1;
        int sucessor = numero+1;

        System.out.println("Antecessor: " + antecessor );
        System.out.println("Número: " + numero );
        System.out.println("Sucessor: " + sucessor );

        scanner.close();
    }
}
