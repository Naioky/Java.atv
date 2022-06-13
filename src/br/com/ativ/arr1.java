package src.br.com.ativ;

//Ordem Inversa: Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa.

public class arr1 {
    public static void main(String[] args) {
        int[] vetor = { -2, 0, 3, 5, 1 };
        int i = 0;
        System.out.print("Vetor: ");
        while (i < vetor.length) {
            System.out.print(vetor[i] + " ");
            i++;
        }

        System.out.print("\n Vetor inverso: ");

        for (int inv = (vetor.length - 1); inv >= 0; inv--) {
            System.out.print(vetor[inv] + " ");

        }
    }
}
