package exercicios;

import java.util.Scanner;

//Faça um programa para calcular o Máximo Divisor Comum entre 2 números passados como
//argumentos para a execução do programa. Observe as seguintes propriedades do MDC:
// MDC(x, y) = MDC(x − y, y), se x > y;
// MDC(x, y) = MDC(y, x);
// MDC(x, x) = x.
//Exemplo: MDC(3,5)=MDC(5,3)=MDC(2,3)=MDC(3,2)=MDC(1,2)=MDC(2,1)=MDC(1,1)=1


public class ex2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(MDC(a,b));
    }

    static int MDC(int x, int y) {
        if (x == y) {
            return x;
        }
        if (x > y) {
            return MDC(x-y, y);
        }
        else {
            return MDC(y, x);
        }
    }
}
