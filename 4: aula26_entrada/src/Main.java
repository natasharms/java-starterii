import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // LEITURA DE STRINGS
        String n;
        System.out.print("Digite uma palavra: ");
        n = sc.next(); // leitura
        System.out.println("Você digitou: " + n);

        //LEITURA DE INTEIROS
        System.out.print("Digite um numero inteiro: ");
        int i;
        i = sc.nextInt(); //leitura de numero inteiro
        System.out.println("Você digitou: " + i);

        //LEITURA DE DOUBLE
        System.out.print("Digite um numero float: ");
        double d;
        d = sc.nextDouble(); //leitura de numero double
        System.out.println("Você digitou: " + d);

        //LEITURA DE CARACTERE
        System.out.print("Digite um char: ");
        char c;
        c = sc.next().charAt(0); // a função charAt(x) define a posição do caractere que vc quer em caso de entrar uma string inteira
        System.out.println("Você digitou: " + c);

        //PARA LER VÁRIOS DADOS NA MESMA LINHA
        String x;
        int y;
        double z;

        x= sc.next();
        y= sc.nextInt();
        z= sc.nextDouble();
        System.out.println("Você digitou: " + x + " " + y + " " + z);

        // PARA LER UM TEXTO ATÉ A QUEBRA DE LINHA
        String s1, s2, s3;

        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // QUEBRA DE LINHA PENDENTE: quando você usa um comando de leitura diferente do nextLine() e dá alguma quebra de linha, essa quebra de linha fica "pendente" na entrada padrão.
        //Se você então fizer um nextLine(), aquela quebra de linha pendente será absorvida pelo nextLine().
        //Solução: faça um nextLine() extra antes de fazer o nextLine() de seu interesse.

        int j;
        String s4, s5, s6;

        j = sc.nextInt();
        sc.nextLine(); //extra pra limpar o buffer
        s4 = sc.nextLine();
        s5 = sc.nextLine();
        s6 = sc.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(j);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);

        sc.close();
    }
}
