package br.com.dio.bootcamp.exercicios.arrays;

/*
 *   Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100) e armazene-os no vetor.
 *   Ao final mostre os números e os sucessores.
 * */

import java.util.Random;

public class Ex3_NumerosAleatorios {

    public static void main(String[] args) {

        Random random = new Random();

        int[] numeroAleatorios = new int[20];

        for (int i = 0; i < numeroAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numeroAleatorios[i] = numero;
        }

        System.out.print("Numeros aleatórios: ");
        for (int numero : numeroAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.print("\nSucessores do Numeros aleatórios: ");
        for (int numero : numeroAleatorios) {
            System.out.print((numero + 1) + " ");
        }

        System.out.print("\nAntecessores do Numeros aleatórios: ");
        for (int numero : numeroAleatorios) {
            System.out.print((numero - 1) + " ");
        }

    }

}
