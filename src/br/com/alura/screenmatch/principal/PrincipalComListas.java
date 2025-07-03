package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmePaulo = new Filme("Dogville", 2003);
        filmePaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmePaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
                System.out.println();
            }

        }

        ArrayList<String> listaAtor = new ArrayList();
        listaAtor.add("Adam Samdler");
        listaAtor.add("Leo");
        listaAtor.add("Ju");
        Collections.sort(listaAtor);
        System.out.println(listaAtor);

        Collections.sort(lista);
        System.out.println("Comparando em ordem alfabetica");
        System.out.println(lista);
        System.out.println("");
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Comparando por ano de lançamento");
        System.out.println(lista);

    }
}
