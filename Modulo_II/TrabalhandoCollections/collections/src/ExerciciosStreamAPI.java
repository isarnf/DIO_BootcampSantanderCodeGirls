import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {
    public static void main(String[] args) {

        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos da lista de String");
        numerosAleatorios.forEach(System.out::println);

        System.out.println("------------------------------------------------------------");

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("------------------------------------------------------------");

        System.out.println("Transforme esta lista de String em uma lista de números inteiros");
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .toList()
                .forEach(System.out::println);

        System.out.println("------------------------------------------------------------");

        System.out.println("Pegue os números pares e maiores que 2 e coloque-os em uma lista");
        List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2)
                .collect(Collectors.toList());
        System.out.println(listParesMaioresQue2);

        System.out.println("------------------------------------------------------------");

        System.out.println("Mostre a média dos números");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("------------------------------------------------------------");

        System.out.println("Remova os valores ímpares");
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numerosAleatoriosInteger.removeIf(i -> (i % 2 != 0));
        System.out.println(numerosAleatoriosInteger);

        System.out.println("------------------------------------------------------------");

        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante");
        System.out.println(numerosAleatorios);
        numerosAleatorios.stream()
                .skip(3)
                .forEach(System.out::println);

        System.out.println("------------------------------------------------------------");

        System.out.println("Retirando os números repetidos da lista, quantos números ficam?");
        /*int size = numerosAleatoriosInteger.stream().collect(Collectors.toSet()).size();
        System.out.println(size);*/
        long countNumerosUnicos = numerosAleatorios.stream()
                .distinct()
                .count();
        System.out.println(countNumerosUnicos);

        System.out.println("------------------------------------------------------------");

        System.out.print("Mostre o menor valor da lista\n");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .min()
                .ifPresent(System.out::println);

        System.out.println("------------------------------------------------------------");

        System.out.print("Mostre o maior valor da lista\n");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);

        System.out.println("------------------------------------------------------------");

        System.out.println("Pegue apenas os números pares e some");
        int somaDosNumerosImpares = numerosAleatoriosInteger.stream()
                .filter(i -> (i % 2 == 0))
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(somaDosNumerosImpares);

        System.out.println("------------------------------------------------------------");

        System.out.println("Mostre a lista na ordem númerica");
        List<Integer> numerosOrdemNatural = numerosAleatoriosInteger.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(numerosOrdemNatural);

    }
}
