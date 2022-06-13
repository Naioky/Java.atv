package src.br.com.ativ;

import java.util.Scanner;

// Maior e Média: Faça um programa que leia 5 números e informe o maior número e a média desses números.

public class media {
    public static void main(String[] args) {
        int counter = 0;
        int numholder = 0;
        int num;
        int sumtotal = 0;

        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Numero: ");
            num = scan.nextInt();
            counter = counter + 1;

            sumtotal = sumtotal + num;

            if (num > numholder) {
                numholder = num;
            }

        } while (counter < 5);

        System.out.println("Maior: " + numholder);
        System.out.println("Media: " + sumtotal / counter);

    }
}
