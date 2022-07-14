package exercicios.loops;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Fatorial do número: ");
        int numero = scan.nextInt();

        int fatorial = 1;

        System.out.print(numero + "! = ");
        for(int i = numero; i > 0; i--){
            fatorial = fatorial * i;
        }

        System.out.println(fatorial);
    }
}
