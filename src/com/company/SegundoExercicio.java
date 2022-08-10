package com.company;

import java.util.Scanner;

public class SegundoExercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Qual seu nome ? ");
        String nome = scanner.nextLine();

        System.out.println("Digite a senha: ");
        String senha = scanner.nextLine();

        if (senha.equalsIgnoreCase("portugol")){
           System.out.println("Olá, bem vindo(a) " + nome);
       }else {
           System.out.println("Desculpe " + nome + " senha inválida! ");
       }
    }
}
