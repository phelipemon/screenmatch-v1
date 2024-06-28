package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1972);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2009);
        outroFilme.avalia(6);
        Filme pulpFiction = new Filme("Pulp Fiction", 1995);
        pulpFiction.avalia(10);

        Serie lost = new Serie("Lost", 2004);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(pulpFiction);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        Filme f1VariavelDeReferencia = pulpFiction;

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
            System.out.println("Classificação: " + filme.getClassificacao());
           }
        }

        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Terry Crews");
        buscaPorArtista.add("Morgan Freeman");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação:");
        System.out.println(buscaPorArtista);

        System.out.println("Lista de títulos ordenados: ");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano: ");
        System.out.println(lista);
    }
}


