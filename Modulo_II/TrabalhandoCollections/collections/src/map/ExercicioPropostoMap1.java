package map;

/*
Dada a população estimada de alguns estados do NE brasileiro, faça:
Estado = PE - População = 9.616.621
Estado = AL - População = 3.351.543
Estado = CE - População = 9.187.103
Estado = RN - População = 3.534.265
Crie um dicionário e relacione os estados e suas populações;
Substitua a população do estado do RN por 3.534.165;
Confira se o estado PB está no dicionário, caso não adicione: PB -
4.039.277;
Exiba a população PE;
Exiba todos os estados e suas populações na ordem que foi
informado;
Exiba os estados e suas populações em ordem alfabética;
Exiba o estado com o menor população e sua quantidade;
Exiba o estado com a maior população e sua quantidade;
Exiba a soma da população desses estados;
Exiba a média da população deste dicionário de estados;
Remova os estados com a população menor que 4.000.000;
Apague o dicionário de estados;
Confira se o dicionário está vazio.
 */

import java.util.*;

public class ExercicioPropostoMap1 {
    public static void main(String[] args) {

        System.out.println("Crie um dicionário e relacione os estados e suas populações");
        Map<String, Double> populacaoNordeste = new HashMap<>(){{
            put("PE", 9616621d);
            put("AL", 3351543d);
            put("CE", 9187103d);
            put("RN", 3534265d);
        }};
        System.out.println(populacaoNordeste);

        System.out.println("------------------------------------------------------------");

        System.out.println("Substitua a população do estado do RN por 3.534.165");
        populacaoNordeste.replace("RN", 3534165d);
        System.out.println(populacaoNordeste);

        System.out.println("------------------------------------------------------------");

        System.out.println("Confira se o estado PB está no dicionário, caso não adicione: PB -\n" +
                "4.039.277");
        System.out.println(populacaoNordeste.containsKey("PB"));
        populacaoNordeste.put("PB", 4039277d);
        System.out.println(populacaoNordeste);

        System.out.println("------------------------------------------------------------");

        System.out.println("Exiba a população PE");
        System.out.println(populacaoNordeste.get("PE"));

        System.out.println("------------------------------------------------------------");

        System.out.println("Exiba todos os estados e suas populações na ordem que foi informado");
        Map<String, Double> populacaoNordeste1 = new LinkedHashMap<>(){{
            put("PE", 9616621d);
            put("AL", 3351543d);
            put("CE", 9187103d);
            put("RN", 3534265d);
            put("PB", 4039277d);
        }};
        System.out.println(populacaoNordeste1);

        System.out.println("------------------------------------------------------------");

        System.out.println("Exiba os estados e suas populações em ordem alfabética");
        Map<String, Double> populacaoNordeste2 = new TreeMap<>(populacaoNordeste);
        System.out.println(populacaoNordeste2);

        System.out.println("------------------------------------------------------------");

        System.out.println("Exiba o estado com o menor população e sua quantidade");
        Double menorPopulacao = Collections.min(populacaoNordeste.values());
        Set<Map.Entry<String, Double>> entradas = populacaoNordeste.entrySet();
        String estadoMenorPopulacao = "";
        for(Map.Entry<String, Double> entrada : entradas){
            if(entrada.getValue().equals(menorPopulacao)) {
                estadoMenorPopulacao = entrada.getKey();
                System.out.println("Estado com menor população: " + estadoMenorPopulacao + " - " + menorPopulacao);

            }
        }

        System.out.println("------------------------------------------------------------");

        System.out.println("Exiba a soma da população desses estados");
        Double somaPopulacao = 0d;
        Iterator<Double> iterator = populacaoNordeste.values().iterator();
        while(iterator.hasNext()){
            somaPopulacao += iterator.next();
        }
        System.out.println("Soma = " + somaPopulacao);

        System.out.println("------------------------------------------------------------");

        System.out.println("Exiba a média da população deste dicionário de estados");
        System.out.println("Média da população: " + somaPopulacao/populacaoNordeste.size());

        System.out.println("------------------------------------------------------------");

        System.out.println("Remova os estados com a população menor que 4.000.000");
        System.out.println(populacaoNordeste);
        Iterator<Double> iterator1 = populacaoNordeste.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next() < 4000000d) iterator1.remove();
        }
        System.out.println(populacaoNordeste);

        System.out.println("------------------------------------------------------------");

        System.out.println("Apague o dicionário de estados");
        populacaoNordeste.clear();
        System.out.println(populacaoNordeste);

        System.out.println("------------------------------------------------------------");

        System.out.println("Confira se o dicionário está vazio");
        System.out.println(populacaoNordeste.isEmpty());

    }
}
