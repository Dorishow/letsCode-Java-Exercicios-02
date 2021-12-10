package com.letsCode.questao04;

import java.util.Scanner;

public class CurrencyConversor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a cotação do Dólar de hoje?");
        double dollarToday = scan.nextDouble();

        System.out.println("Quantos reais você deseja converter?");
        double currencyToConvert = scan.nextDouble();

        System.out.printf(
            "R$%.2f equivalem a $%.2f dólares",
            currencyToConvert, realToDollar(dollarToday, currencyToConvert)
        );

    }
    public static double realToDollar(double dollarToday, double valueInReal){
        return ( (1 / dollarToday) * valueInReal);
    }
}
