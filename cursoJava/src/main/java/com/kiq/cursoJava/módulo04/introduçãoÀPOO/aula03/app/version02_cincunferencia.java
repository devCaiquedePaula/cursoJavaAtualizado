package com.kiq.cursoJava.módulo04.introduçãoÀPOO.aula03.app;

import com.kiq.cursoJava.módulo04.introduçãoÀPOO.aula03.utils.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class version02_cincunferencia {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calculator  = new Calculator();

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = calculator.cincumference(radius);
        double v = calculator.volume(radius);

        System.out.printf("CIRCUMFERENCE: %.2f%n", c);
        System.out.printf("VOLUME: %.2f%n", v);
        System.out.printf("PI VALUE: %.2f%n", Math.PI);
    }
}
