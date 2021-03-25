package com.company;
import java.util.Locale;
import java.util.Scanner;

public class For2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
        //Lembrando que, por definição, fatorial de 0 é 1.

        int n = sc.nextInt();

        int resultado = 1;

        for (int i = 1; i <= n; i++) {
            if (n == 0) break;
            resultado *= i;
        }

        System.out.println(n + "! = " + resultado);


        sc.close();
    }
}
