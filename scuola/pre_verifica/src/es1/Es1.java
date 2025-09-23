package es1;

import java.util.Scanner;

public class Es1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int nVolte = 10;
        int n;
        int somma = 0;

        for(int i = 0; i < nVolte; i++){
            System.out.println("inserisci numero");
            n = scanner.nextInt();
            if(n > 0){
                somma += n;
            }
        }
        System.out.println("risultato final e= " + somma);
    }
}
