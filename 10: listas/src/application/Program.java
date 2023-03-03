package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(); // INSTANCIAÇÃO DA LISTA
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        list.add(2, "Marco"); // INSERE UM ELEMENTO NA POSIÇÃO 2

        System.out.println(list.size()); // IMPRIME O TAMANHO DA LISTA

        for (String x : list) {
            System.out.println(x); // IMPRIME A LISTA TODA
        }

        System.out.println("---------------------");
        list.removeIf(x -> x.charAt(0) == 'M'); // REMOVE QUEM O NOME COMEÇA COM M
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("---------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob")); // POSIÇÃO DO BOB NA LISTA (SEM OS QUE COMEÇAM COM M)
        System.out.println("Index of Marco: " + list.indexOf("Marco")); // QUANDO O indexOf NÃO ENCONTRA O ELEMENTO ELE RETORNA -1
        System.out.println("---------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); // CONVERTE PRA STREAM, FAZ A OPERAÇÃO LAMBDA E VOLTA PRA LISTA COM O collect
        // RETORNA UMA LISTA COM QUEM COMEÇA COM A
        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("---------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); // RETORNA O PRIMEIRO ELEMENTO QUE ATENDE AO PREDICADO
        System.out.println(name);
    }
}