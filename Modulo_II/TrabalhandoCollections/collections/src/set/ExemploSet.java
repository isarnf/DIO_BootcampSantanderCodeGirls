package set;

// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto e adicione as notas");
        Set<Double> notas = new HashSet<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
        System.out.println(notas);

        System.out.println("------------------------------------------------------------");

        System.out.println("Confira se a nota 5.0 está no conjunto");
        System.out.println(notas.contains(5d));

        System.out.println("------------------------------------------------------------");

        System.out.println("Exiba a menor nota");
        Collections.min(notas);

        System.out.println("------------------------------------------------------------");

        System.out.println("Exiba a maior nota");
        Collections.max(notas);

        System.out.println("------------------------------------------------------------");

        System.out.println("Exiba a soma dos valores");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma = " + soma);

        System.out.println("------------------------------------------------------------");

        System.out.println("Exiba a média das notas");
        System.out.println("Média = " + soma/notas.size());

        System.out.println("------------------------------------------------------------");

        System.out.println("Remova a nota 0");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("------------------------------------------------------------");

        System.out.println("Remova as notas menores que 7 e exiba a lista");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("------------------------------------------------------------");

        System.out.println("Exiba todas as notas na ordem em que foram informadas");
        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas2);

        System.out.println("------------------------------------------------------------");

        System.out.println("Exiba todas as notas na ordem crescente");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("------------------------------------------------------------");

        System.out.println("Apague todo o conjunto");
        notas.clear();
        System.out.println(notas);

        System.out.println("------------------------------------------------------------");

        System.out.println("Confira se o conjunto está vazio");
        System.out.println(notas.isEmpty());

        System.out.println("------------------------------------------------------------");

        System.out.println("Confira se o conjunto 2 está vazio");
        System.out.println(notas2.isEmpty());

        System.out.println("------------------------------------------------------------");

        System.out.println("Confira se o conjunto 3 está vazio");
        System.out.println(notas3.isEmpty());



    }
}
