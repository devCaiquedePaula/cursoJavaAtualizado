package com.kiq.cursoJava.módulo04.introduçãoÀPOO.aula03.app;

import java.util.Locale;
import java.util.Scanner;

public class version01_circunferencia {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = cincumference(radius);
        double v = volume(radius);

        System.out.printf("CIRCUMFERENCE: %.2f%n", c);
        System.out.printf("VOLUME: %.2f%n", v);
        System.out.printf("PI VALUE: %.2f%n", Math.PI);
    }

    public static double cincumference(double radius) {
        return 2.0 * Math.PI * radius;
    }

    public static double volume(double radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}