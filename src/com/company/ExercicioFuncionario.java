package com.company;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFuncionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.print("Name: ");
        employee.Name = sc.nextLine();
        System.out.print("Gross salary: ");
        employee.GrossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.Tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + employee);

        System.out.print("Which percentage to increase salary?");
        double percentage = sc.nextDouble();
        employee.IncreaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + employee);

        sc.close();
    }
}