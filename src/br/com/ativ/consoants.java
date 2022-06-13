package src.br.com.ativ;

import java.util.Scanner;

// 🔹Consoantes: Faça um Programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.

public class consoants {
    public static void main(String[] args) {
        int contador = 0;
        Scanner scan = new Scanner(System.in);
        String[] vetor = new String[6];

        int i = 0;
        do {
            System.out.println("Letra: ");
            String letra = scan.next();
            if (!(letra.equalsIgnoreCase("a") | letra.equalsIgnoreCase("e") | letra.equalsIgnoreCase("i")
                    | letra.equalsIgnoreCase("o") | letra.equalsIgnoreCase("u"))) {
                vetor[i] = letra;
                contador++;
            }

            i++;

        } while (i < vetor.length);

        System.out.println("Consoantes: ");
        for (String consoante : vetor) {
            if (consoante != null) {
                System.out.print(consoante + " ");

            }
            System.out.println("Quantidade de consoantes: " + contador);
            System.out.println(vetor.length);
        }

    }
}
