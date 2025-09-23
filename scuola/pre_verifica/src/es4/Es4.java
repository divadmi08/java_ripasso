package es4;

import java.util.Scanner;


public class Es4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] lista = new int[5];
        int n;
        int n_max = -9999;
        for(int i = 0; i < 5; i++){
            System.out.println("inserisci numero");
            n = scanner.nextInt();
            lista[i] = n;
            if(n > n_max){
                n_max = n;
            }
        }
        System.out.println("numero massimo è " + n_max);
    }
}
