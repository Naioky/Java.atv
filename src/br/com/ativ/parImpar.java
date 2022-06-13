package src.br.com.ativ;

import java.util.Scanner;

// Par e Ímpar: Faça um programa que peça N números inteiros. Calcule e mostre a quantidade de números pares e a quantidade de números impares.

public class parImpar {
    public static void main(String[] args) {
        int numPar = 0;
        int numImp = 0;
        int n;
        int num = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a quantidade de vezes de repetição: ");
        n = scan.nextInt();
        do {
            n = n - 1;
            System.out.println("Informe um numero: ");
            num = scan.nextInt();
            if (num % 2 == 0) {
                numPar = numPar + 1;
            } else {
                numImp = numImp + 1;
            }

        } while (n > 0);

        System.out.println("Você registrou: " + numPar + "numeros pares" + System.lineSeparator() + "Você registrou: "
                + numImp + "numeros impares");
    }

}
