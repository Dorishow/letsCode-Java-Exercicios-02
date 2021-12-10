package com.letsCode.questao02;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número para que sua tabuada seja exibida");
        int number = scan.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.printf("%d * %d = %d %n", number, i, number * i);
        }
    }
}
