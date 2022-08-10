package com.company;

import java.util.Scanner;

public class PrimeiroExercicio {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double media = 0;

        System.out.println("Digite a primeira nota: ");
        int nota1 = s.nextInt();

        System.out.println("Digite a segunda nota: ");
        int nota2 = s.nextInt();

        media += (nota1 + nota2) / 2;

        if (media >= 7){
            System.out.println("Parabéns, você foi aprovado. Sua média foi de: " + media);
        }else {
            System.out.println("Lamento, mas você foi reprovado. Sua média foi de: " + media);
        }
    }
}
