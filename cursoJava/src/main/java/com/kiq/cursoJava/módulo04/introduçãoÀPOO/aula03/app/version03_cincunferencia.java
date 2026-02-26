package com.kiq.cursoJava.módulo04.introduçãoÀPOO.aula03.app;

import com.kiq.cursoJava.módulo04.introduçãoÀPOO.aula03.utils.Calculator2;

import java.util.Locale;
import java.util.Scanner;

public class version03_cincunferencia {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator2.cincumference(radius);
        double v = Calculator2.volume(radius);

        System.out.printf("CIRCUMFERENCE: %.2f%n", c);
        System.out.printf("VOLUME: %.2f%n", v);
        System.out.printf("PI VALUE: %.2f%n", Math.PI);
    }
}
