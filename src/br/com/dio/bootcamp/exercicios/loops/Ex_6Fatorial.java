package br.com.dio.bootcamp.exercicios.loops;

/*
 *   Faça um programa que calcule o fatorial e um número inteiro fornecido pelo usuário.
 *
 * */

import java.util.Scanner;

public class Ex_6Fatorial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número para descobrir o fatorial: ");
        int numero = scan.nextInt();

        int fatorial = 1;

        System.out.print(numero + "! = ");

        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }
        System.out.println(fatorial);

    }

}
