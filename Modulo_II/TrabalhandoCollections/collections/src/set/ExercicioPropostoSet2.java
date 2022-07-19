package set;

/*
Crie uma classe LinguagemFavorita que possua os atributos
nome, anoDeCriacao e ide. Em seguida, crie um conjunto com
3 linguagens e faça um programa que ordene esse conjunto
por:
Ordem de Inserção
Ordem Natural (nome)
IDE
Ano de criação e nome
Nome, ano de criacao e IDE
Ao final, exiba as linguagens no console, um abaixo da outra.
 */

import java.util.*;

public class ExercicioPropostoSet2 {
    public static void main(String[] args) {
        Set<LinguagemFavorita> linguagensProgramacao = new HashSet<>(){{
                add(new LinguagemFavorita("Python", 1990, "Jupyter"));
                add(new LinguagemFavorita("SQL", 1982, "MySQL Workbench"));
                add(new LinguagemFavorita("Flutter", 2017, "Visual Studio Code"));
        }};

        System.out.println("------------------------------------------------------------");

        System.out.println("Ordem de Inserção");
        Set<LinguagemFavorita> linguagensProgramacao1 = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Python", 1990, "Jupyter"));
            add(new LinguagemFavorita("SQL", 1982, "MySQL Workbench"));
            add(new LinguagemFavorita("Flutter", 2017, "Visual Studio Code"));
        }};

        for(LinguagemFavorita linguagemFavorita : linguagensProgramacao1){
            System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoCriacao() + " - " + linguagemFavorita.getIde());
        }

        System.out.println("------------------------------------------------------------");

        System.out.println("Ordem Natural (nome)");
        Set<LinguagemFavorita> linguagensProgramacao2 = new TreeSet<>(new ComparatorNome());
        linguagensProgramacao2.addAll(linguagensProgramacao);
        for(LinguagemFavorita linguagemFavorita : linguagensProgramacao2){
            System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoCriacao() + " - " + linguagemFavorita.getIde());
        }

        System.out.println("------------------------------------------------------------");

        System.out.println("Ordem por IDE");
        Set<LinguagemFavorita> linguagensProgramacao3 = new TreeSet<>(new ComparatorIDE());
        linguagensProgramacao3.addAll(linguagensProgramacao);
        for(LinguagemFavorita linguagemFavorita : linguagensProgramacao3){
            System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoCriacao() + " - " + linguagemFavorita.getIde());
        }

        System.out.println("------------------------------------------------------------");

        System.out.println("Ordem por ano de criação e nome");
        Set<LinguagemFavorita> linguagensProgramacao4 = new TreeSet<>(new ComparatorAnoCriacaoNome());
        linguagensProgramacao4.addAll(linguagensProgramacao);
        for(LinguagemFavorita linguagemFavorita : linguagensProgramacao4){
            System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoCriacao() + " - " + linguagemFavorita.getIde());
        }

        System.out.println("------------------------------------------------------------");

        System.out.println("Ordem por nome, ano de criação e IDE");
        Set<LinguagemFavorita> linguagensProgramacao5 = new TreeSet<>(new ComparatorNomeAnoCriacaoIDE());
        linguagensProgramacao5.addAll(linguagensProgramacao);
        for(LinguagemFavorita linguagemFavorita : linguagensProgramacao5){
            System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoCriacao() + " - " + linguagemFavorita.getIde());
        }

        System.out.println("------------------------------------------------------------");

        System.out.println("Exiba as linguagens no console, uma abaixo da outra");
        for(LinguagemFavorita linguagemFavorita : linguagensProgramacao){
            System.out.println(linguagemFavorita.getNome());
        }
    }
}

class ComparatorNome implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.getNome().compareToIgnoreCase(l2.getNome());
    }
}

class ComparatorIDE implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.getIde().compareToIgnoreCase(l2.getIde());
    }
}

class ComparatorAnoCriacaoNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int anoCriacao = Integer.compare(l1.getAnoCriacao(), l2.getAnoCriacao());
        if(anoCriacao != 0) return anoCriacao;
        return l1.getNome().compareToIgnoreCase(l2.getNome());
    }
}

class ComparatorNomeAnoCriacaoIDE implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.getNome().compareToIgnoreCase(l2.getNome());
        if(nome != 0) return nome;
        int anoCriacao = Integer.compare(l1.getAnoCriacao(), l2.getAnoCriacao());
        if(anoCriacao != 0) return anoCriacao;
        return  l1.getIde().compareToIgnoreCase(l2.getIde());
    }
}
