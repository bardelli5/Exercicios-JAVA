package com.company;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioAluno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student x;

        x = new Student();
        x.student = sc.nextLine();
        x.t1 = sc.nextDouble();
        x.t2 = sc.nextDouble();
        x.t3 = sc.nextDouble();

        double finalGrade = x.finalGrade();

        if (finalGrade >= 60.00) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", 60.00 - finalGrade);
        }

        sc.close();
    }
}