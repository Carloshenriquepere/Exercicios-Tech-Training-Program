package com.company;

import java.util.Scanner;

public class TerceiroExercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número! ");
        int num = scanner.nextInt();

        if (num >= 10 && num <= 20){
            System.out.println("O número está dentro de 10 e 20! ");
        }else{
            System.out.println("O número não está dentro de 10 e 20!");
        }
    }
}
