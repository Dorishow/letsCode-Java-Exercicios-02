package com.letsCode.questao03;

import java.util.Scanner;

public class TemperatureConversor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma temperatura em ºC para ser convertida em ºF");

        float temperature = scan.nextFloat();
        convertToFahrenheit(temperature);
    }

    public static void convertToFahrenheit(float temperature){
        System.out.printf("%f Cº = %f Fº", temperature, (temperature * 9/5) + 32);
    }
}
