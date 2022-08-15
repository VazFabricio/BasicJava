package com.operacoes;

import java.util.Scanner;

public class operacoesbasicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int primeirovalor, segundovalor, operacao;
        System.out.println("|---------------|");
        System.out.println("|--CALCULADORA--|");
        System.out.println("|---------------|");
        System.out.print("Qual primeiro valor: ");
        primeirovalor = sc.nextInt();
        System.out.print("Qual o segundo valor: ");
        segundovalor = sc.nextInt();
        System.out.print("Qual operacao voce deseja realizar? \n [1] Adicao \n [2] Subtracao \n [3] Multiplicacao \n [4] Divisao \n -> ");
        operacao = sc.nextInt();
            if (operacao == 1) {
                System.out.println("A soma de " + primeirovalor + " com " + segundovalor + " e: " + (primeirovalor + segundovalor));
            } else if (operacao == 2) {
                System.out.println("A subtracao de " + primeirovalor + " com " + segundovalor + " e: " + (primeirovalor - segundovalor));
            } else if (operacao == 3) {
                System.out.println("A multiplicacao de " + primeirovalor + " com " + segundovalor + " e: " + (primeirovalor * segundovalor));
            } else if (operacao == 4) {
                System.out.println("A divisao de " + primeirovalor + " com " + segundovalor + " e: " + (primeirovalor / segundovalor));
            } else
                System.out.println("Opcao invalida");

        }

    }
