package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
        Stream<Integer> st1 = list.stream(); // ciando stream a parir da lista
        System.out.println(Arrays.toString(st1.toArray())); // toArray converte a stream pra vetor

        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(st2.toArray()));

        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2); // você passa o primeiro elemento como parâmetro e uma função que itera esse elemento
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

        // Sequência de Fibonacci
        Stream<Long> st4 = Stream.iterate(new long[]{ 0L, 1L }, p->new long[]{ p[1], p[0]+p[1] }).map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(10).toArray()));
    }
}
