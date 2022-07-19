package list;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma
pessoa sobre um crime. As perguntas são:

"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?"

Se a pessoa responder positivamente a 2 questões ela deve ser
classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
"Assassina". Caso contrário, ela será classificado como "Inocente".
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioPropostoList2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> respostas = new ArrayList<>();
        int quantidadeRespostasPositivas = 0;

        System.out.println("Responda as perguntas com S (Sim) ou N (Não)\n");
        System.out.print("Telefonou para a vítima? ");
        respostas.add(scanner.next());
        System.out.print("Esteve no local do crime? " );
        respostas.add(scanner.next());
        System.out.print("Mora perto da vítima? ");
        respostas.add(scanner.next());
        System.out.print("Devia para a vítima? ");
        respostas.add(scanner.next());
        System.out.print("Já trabalhou com a vítima? ");
        respostas.add(scanner.next());

        System.out.println("\nRespostas: ");
        System.out.println(respostas);

        for(String resposta : respostas){
            if(resposta.equalsIgnoreCase("S")) quantidadeRespostasPositivas++;
        }

        switch(quantidadeRespostasPositivas){
            case 0: System.out.println("Inocente"); break;
            case 1: System.out.println("Inocente"); break;
            case 2: System.out.println("Suspeita"); break;
            case 3: System.out.println("Suspeita"); break;
            case 4: System.out.println("Cúmplice"); break;
            case 5: System.out.println("Assassina"); break;
            default: System.out.println("Não é possível afirmar nada sobre a pessoa investigada."); break;
        }
    }
}
