package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Bosta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        System.out.print("Informe a nota da primeira prova: ");
        int Nota1 = sc.nextInt();
        System.out.print("Informe a nota da segunda prova: ");
        int Nota2 = sc.nextInt();
        System.out.print("Informe a nota da terceira prova: ");
        int Nota3 = sc.nextInt();

        int Media1;
        Media1 = (Nota1 + Nota2 + Nota3) / 3;

        System.out.println();
        System.out.println("Média 1 = " + Media1);


        System.out.println();
        System.out.print("Informe a nota da quarta prova: ");
        int Nota4 = sc.nextInt();
        System.out.print("Informe a nota da quinta prova: ");
        int Nota5 = sc.nextInt();
        System.out.print("Informe a nota da sexta prova: ");
        int Nota6 = sc.nextInt();

        int Media2;
        Media2 = (Nota4 + Nota5 + Nota6) / 3;

        System.out.println();
        System.out.println("Média 2 = " + Media2);


        int SomaMedia;
        SomaMedia = Media1 + Media2;

        System.out.println();
        System.out.println("Soma das Médias = " + SomaMedia);

        int MediaMedia;
        MediaMedia = (Media1 + Media2) / 2;

        System.out.println();
        System.out.println("Média das Médias = " + MediaMedia);

    }
}
