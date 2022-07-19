package list;

/* Faça um programa que receba a temperatura média dos 6
primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e
mostre todas as temperaturas acima desta média, e em que
mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
– Fevereiro e etc).
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioPropostoList1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> temperaturasMedias = new ArrayList<>();
        double somaTemperaturasSemestre = 0;

        for(int i = 1; i <= 6; i++){
            System.out.printf("Digite a temperatura referente ao mês %d: ", i);
            double temperatura = scanner.nextDouble();
            temperaturasMedias.add(temperatura);
            somaTemperaturasSemestre += temperatura;
        }

        double mediaSemestral = somaTemperaturasSemestre / 6;
        System.out.println("\nTemperatura média: " + mediaSemestral + " oC");

        System.out.println("Meses com temperaturas acima da média semestral: ");
        for(int i = 0; i < temperaturasMedias.size(); i++){
            if(temperaturasMedias.get(i) > mediaSemestral){
                switch(i){
                    case 1: System.out.println("1 - Janeiro: " + temperaturasMedias.get(i) + " oC"); break;
                    case 2: System.out.println("2 - Fevereiro: " + temperaturasMedias.get(i) + " oC"); break;
                    case 3: System.out.println("3 - Março: " + temperaturasMedias.get(i) + " oC"); break;
                    case 4: System.out.println("4 - Abril: " + temperaturasMedias.get(i) + " oC"); break;
                    case 5: System.out.println("5 - Maio: " + temperaturasMedias.get(i) + " oC"); break;
                    case 6: System.out.println("6 - Junho: " + temperaturasMedias.get(i) + " oC"); break;
                    default: break;
                }
            }
        }

    }
}

