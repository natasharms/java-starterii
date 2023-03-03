package application;

import entities.Client;

public class Program {
    public static void main(String[] args) {

        //HASHCODE
        /*
        String a = "Maria";
        String b = "Alex";

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        */
        //EQUALS
        /*
        String a2 = "Maria";
        String b2 = "Alex";
        System.out.println(a2.equals(b2));
        */

        Client c1 = new Client("Maria", "Maria@gmail.com");
        Client c2 = new Client("Maria", "Maria@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2)); // compara o conteúdo
        System.out.println(c1 == c2); // compara a referência

    }
}
