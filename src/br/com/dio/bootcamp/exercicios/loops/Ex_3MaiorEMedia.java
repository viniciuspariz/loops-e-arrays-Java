package br.com.dio.bootcamp.exercicios.loops;

/*
 *   Faça um programa que leia 5 números e
 *   informe o maior valor e
 *   a média desses números.
 *
 * */

import java.util.Scanner;

public class Ex_3MaiorEMedia {

    public static void main(String[] args) {

        int numero;
        int count = 0;
        int maior = 0;
        int soma = 0;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;

            count = count + 1;
        } while (count < 5);

        System.out.println("O maior número é " + maior);
        System.out.println("A média é :"+((soma)/count));
    }

}
