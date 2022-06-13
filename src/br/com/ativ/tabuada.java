package src.br.com.ativ;

import java.util.Scanner;

/*
 * Tabuada: Desenvolva um gerador de tabuada, 
 * capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. 
 * O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
*/

public class tabuada {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o numero para a tabuada: ");
        num = scan.nextInt();

        System.out.println("tabuada de " + num + ":");
        for (int i = 1; i <= 10; i++) {

            System.out.println(num + "x" + i + "= " + num * i);

        }
    }
}
