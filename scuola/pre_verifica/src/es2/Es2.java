package es2;

import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci quanti numeri vuoi inserire");
        int tot = scanner.nextInt();

        int[] lista = new int[tot];

        int n;
        int somma = 0;
        for(int i = 0; i < tot; i++){
            System.out.println("insreisci nuemro");
            n = scanner.nextInt();
            lista[i] = n;
            if(n % 2 == 0){
                somma += n;
            }
        }
        System.out.println("somma n pari = " + somma);


    }


}
