/*
Fazer um programa para ler três números inteiros e mostrar na tela o maior deles.
*/
import java.util.Scanner;
public class Main {
    public static int max(int x, int y, int z) { // método pra retornar o maior
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }
    public static void showResult(int value) { // método pra imprimir
        System.out.println("Higher = " + value);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int higher = max(a, b, c);
        showResult(higher);
        sc.close();
    }

}