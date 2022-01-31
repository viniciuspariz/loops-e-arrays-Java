package br.com.dio.bootcamp.exercicios.loops;

/*
 *   Desenvolva um gerador de tabuada,
 *   capaz de gerar a tabuada de qualquer numero inteiro entre 1 e 10.
 *   o usuário deve informar de qual numero ele deseja ver a tabuada.
 *   A saída deve ser conforme abaixo:
 *
 *   Tabuada do 5:
 *   5 x 1 = 5
 *   5 x 2 = 10
 *   .
 *   .
 *   .
 *   5 x 10 = 50
 *
 * */

import java.util.Scanner;

public class Ex_5Tabuada {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o número para qual deseja saber a taubada: ");
        int numeroTabuada = scan.nextInt();

        System.out.println("Tabuada do " + numeroTabuada);

        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroTabuada + " x " + i + " = " + (numeroTabuada * i));
        }

    }

}
