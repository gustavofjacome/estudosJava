package Condicoes;


import java.util.Scanner;

public class ScannerDoUsuario {
    static void main(String[] args) {

        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("Escreva aqui o seu nome: ");
        String nome = caixaDeTexto.nextLine();

        System.out.println("Escreva aqui o sua idade: ");
        int idade = caixaDeTexto.nextInt();

        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);

        if (idade >= 18){
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é de menor");
        }

        caixaDeTexto.close();
    }









}
