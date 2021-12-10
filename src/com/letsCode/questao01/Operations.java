package com.letsCode.questao01;

public class Operations {
    public static void showSum(int firstNumber, int secondNumber) {
        System.out.printf("%d + %d = ", firstNumber, secondNumber);
        System.out.printf("%d %n", firstNumber + secondNumber);
    }

    public static void showSubtraction(int firstNumber, int secondNumber) {
        System.out.printf("%d - %d = ", firstNumber, secondNumber);
        System.out.printf("%d %n", firstNumber - secondNumber);
    }

    public static void showMultiplication(int firstNumber, int secondNumber) {
        System.out.printf("%d * %d = ", firstNumber, secondNumber);
        System.out.printf("%d %n", firstNumber * secondNumber);
    }

    public static void showDivision(int firstNumber, int secondNumber) {
        System.out.printf("%d / %d = ", firstNumber, secondNumber);
        System.out.printf("%d %n", firstNumber / secondNumber);
    }
}
