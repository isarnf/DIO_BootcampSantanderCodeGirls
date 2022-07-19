package set;

/*
Crie um conjunto contendo as cores do arco-íris e:
Exiba todas as cores uma abaixo da outra
A quantidade de cores que o arco-íris tem
Exiba as cores em ordem alfabética
Exiba as cores na ordem inversa da que foi informada
Exiba todas as cores que começam com a letra ”v”
Remova todas as cores que não começam com a letra “v”
Limpe o conjunto
Confira se o conjunto está vazio
 */

import java.util.*;

public class ExercicioPropostoSet1 {
    public static void main(String[] args) {

        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("vermelho");
        coresArcoIris.add("laranja");
        coresArcoIris.add("amarelo");
        coresArcoIris.add("verde");
        coresArcoIris.add("azul");
        coresArcoIris.add("anil");
        coresArcoIris.add("violeta");

        System.out.println("------------------------------------------------------------");

        System.out.println("Exiba todas as cores uma abaixo da outra");
        for(String cor : coresArcoIris){
            System.out.println(cor);
        }

        System.out.println("------------------------------------------------------------");

        System.out.println("A quantidade de cores que o arco-íris tem");
        System.out.println("Quantidade de cores: " + coresArcoIris.size());

        System.out.println("------------------------------------------------------------");

        System.out.println("Exiba as cores em ordem alfabética");
        Set<String> coresArcoIris1 = new TreeSet<>(coresArcoIris);
        System.out.println(coresArcoIris1);

        System.out.println("------------------------------------------------------------");

        System.out.println("Exiba as cores na ordem inversa da que foi informada");
        Set<String> coresArcoIris2 = new LinkedHashSet<>(coresArcoIris);
        System.out.println(coresArcoIris2);
        List<String> coresArcoIrisReverse = new ArrayList<>(coresArcoIris2);
        Collections.reverse(coresArcoIrisReverse);
        System.out.println(coresArcoIrisReverse);

        System.out.println("------------------------------------------------------------");

        System.out.println("Exiba todas as cores que começam com a letra ”v”");
        for(String cor : coresArcoIris){
            if(cor.startsWith("v")){
                System.out.println("Cor: " + cor);
            }
        }

        System.out.println("------------------------------------------------------------");

        System.out.println("Remova todas as cores que não começam com a letra “v”");
        System.out.println(coresArcoIris);
        Iterator<String> iterator = coresArcoIris.iterator();
        while(iterator.hasNext()){
            if(iterator.next().startsWith("v")){
                iterator.remove();
            }
        }
        System.out.println(coresArcoIris);

        System.out.println("------------------------------------------------------------");

        System.out.println("Limpe o conjunto");
        coresArcoIris.clear();
        System.out.println(coresArcoIris);

        System.out.println("------------------------------------------------------------");

        System.out.println("Confira se o conjunto está vazio");
        System.out.println(coresArcoIris.isEmpty());


    }
}
