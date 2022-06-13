package src.br.com.ativ;

import java.util.Random;

// 🔹Números Aleatórios: Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor. Ao final, mostre os números e seus sucessores.

public class randomnum {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numerosaleatorios = new int[20];

        for (int i = 0; i < numerosaleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosaleatorios[i] = numero;
        }

        System.out.print("Numeros aleatorios: ");
        for (int numero : numerosaleatorios) {

            System.out.print(numero + " ");

        }

        System.out.print("\n Sucessores: ");
        for (int numero : numerosaleatorios) {

            System.out.print(numero + 1 + " ");

        }

    }
}
