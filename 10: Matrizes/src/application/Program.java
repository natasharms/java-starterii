/*
Fazer um programa para ler um número inteiro N e uma matriz de ordem N contendo números inteiros.
Em seguida, mostrar a diagonal principal e a quantidade de valores negativos da matriz.
 */

package application;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro N: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                System.out.print("Elemento da linha " + (i+1) + " coluna " + (j+1) + ": ");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal:");
        for (int i=0; i<mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int count = 0;
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.println("Negative numbers = " + count);


        sc.close();
    }
}