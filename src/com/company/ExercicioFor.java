package com.company;
import java.util.Locale;
import java.util.Scanner;


public class ExercicioFor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();


        for (int i=1; i<=N; i++) {
            double valor1 = sc.nextDouble();
            double valor2 = sc.nextDouble();
            double valor3 = sc.nextDouble();
            double somaDosValores = (valor1 * 2) + (valor2 * 3) + (valor3 * 5);
            System.out.println("A Media Ponderada do Teste " + i + " = " + (somaDosValores/(2+3+5)));
        }


        sc.close();
    }
}
