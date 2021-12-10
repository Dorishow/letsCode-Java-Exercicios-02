package com.letsCode.questao05;

import java.util.Scanner;

public class MeasurementConverter {

    public static final float INCHES_FACTOR = 2.54F;
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite o valor em polegadas para ser convertido em centímetros");
        float value = scan.nextFloat();
        InchesToCentimeters(value);
    }

    public static void InchesToCentimeters(float inches) {
        System.out.printf("%f polegadas equivalem a %f centímetros", inches, inches * INCHES_FACTOR);
    }
}
