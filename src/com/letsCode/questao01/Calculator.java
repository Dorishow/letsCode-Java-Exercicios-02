package com.letsCode.questao01;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int firstNumber = scan.nextInt();
        System.out.println("Digite o segundo número");
        int secondNumber = scan.nextInt();

        Operations.showSum(firstNumber, secondNumber);
        Operations.showSubtraction(firstNumber, secondNumber);
        Operations.showMultiplication(firstNumber, secondNumber);
        Operations.showDivision(firstNumber, secondNumber);
    }
}
