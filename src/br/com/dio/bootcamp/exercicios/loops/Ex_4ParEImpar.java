package br.com.dio.bootcamp.exercicios.loops;

/*
 *   Faça um programa que peça N números inteiros,
 *   calcule e mostre a quantidade de números pares
 *   e a quantidade de números ímpares.
 *
 * */

import java.util.Scanner;

public class Ex_4ParEImpar {

    public static void main(String[] args) {

        int quantidadeNumeros;
        int numero;
        int quantidadePares = 0, quantidadeImpares = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma quantidade de números inteiros: ");
        quantidadeNumeros = scan.nextInt();

        int count = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantidadePares++;
                else quantidadeImpares++;

                count++;
        } while (count < quantidadeNumeros);

        System.out.println("A quantidade de números pares é: " + quantidadePares);
        System.out.println("A quantidade de números impares é: " + quantidadeImpares);

    }

}
