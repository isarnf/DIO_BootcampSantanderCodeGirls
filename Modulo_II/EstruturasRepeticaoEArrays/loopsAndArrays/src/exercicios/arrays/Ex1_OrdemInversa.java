package exercicios.arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

import java.util.Scanner;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[6];

        for(int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite um valor para vetor[%d]: ",  i);
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Vetor original: " );
        int count = 0;
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }

        System.out.print("\nVetor inverso: ");
        for(int i = vetor.length-1; i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
