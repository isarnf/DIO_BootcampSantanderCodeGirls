package exercicios.arrays;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] caracteres = new String[6];
        String consoantes = "";
        int quantidadeConsoantes = 0;
        int count = 0;

        while(count < caracteres.length){
            System.out.print("Letra: ");
            String letra = scanner.next();
            if(!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {
                consoantes += letra + " ";
                quantidadeConsoantes++;
            }
            caracteres[count] = letra;
            count++;
        }

        System.out.print("String: ");
        for(String letra : caracteres){
            System.out.print(letra + " ");
        }

        System.out.print("\nConsoantes: " + consoantes);
        System.out.print("\nQuantidade de consoantes: " + quantidadeConsoantes);

    }
}
