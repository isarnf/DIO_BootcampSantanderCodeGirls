package list;

// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {

        System.out.println("Crie uma lista e adicione as sete notas");
        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("------------------------------------------------------------");

        System.out.println("Exiba a posição da nota 5.0");
        System.out.println(notas.indexOf(5.0));

        System.out.println("------------------------------------------------------------");

        System.out.println("Adicione na lista a nota 8.0 na posição 4");
        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("------------------------------------------------------------");

        System.out.println("Substitua a nota 5.0 pela nota 6.0");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);

        System.out.println("------------------------------------------------------------");

        System.out.println("Confira se a nota 5.0 está na lista");
        System.out.println(notas.contains(5.0));

        System.out.println("------------------------------------------------------------");

        System.out.println("Exiba todas as notas na ordem em que foram informadas");
        for(Double nota : notas){
            System.out.println(nota);
        }

        System.out.println("------------------------------------------------------------");

        System.out.println("Exiba a terceira nota adicionada");
        System.out.println(notas.get(2));

        System.out.println("------------------------------------------------------------");

        System.out.println("Exiba a menor nota");
        System.out.println(Collections.min(notas));

        System.out.println("------------------------------------------------------------");

        System.out.println("Exiba a maior nota");
        System.out.println(Collections.max(notas));

        System.out.println("------------------------------------------------------------");

        System.out.println("Exiba a soma das notas");

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

        System.out.println("Remova a nota da posição 0");
        notas.remove(0);
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

        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("------------------------------------------------------------");

        System.out.println("Confira se a lista está vazia");
        notas.isEmpty();

        System.out.println("==================================");

        System.out.println("Resolva os exercícios abaixo utilizando os métodos da implementação LinkedList");

        System.out.println("==================================");

        System.out.println("Crie uma lista chamada notas2 e coloque todos os elementos da list ArrayList nessa nova lista");
        LinkedList<Double> notas2 = new LinkedList<Double>(); // [7, 8.5, 9.3, 5, 7, 0, 3.6]
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("------------------------------------------------------------");

        System.out.println("Mostre a primeira nota da nova lista sem removê-la");
        System.out.println(notas2.get(0));

        System.out.println("------------------------------------------------------------");

        System.out.println("Mostre a primeira nota da nova lista removendo-a");
        System.out.println(notas2.removeFirst());
        System.out.println(notas2);
    }
}
