package src.br.com.ativ;

import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        int multi = 1;
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o numero: ");
        int num = scan.nextInt();

        System.out.print(num + "! = ");
        for (int i = num; i >= 1; i--) {
            multi = multi * i;
        }

        System.out.println(multi);

    }
}
