package es3;

import java.util.Scanner;

public class Es3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int voto = 0;
        int somma = 0;
        float media;
        int count = 0;

        while(voto != -1){
            System.out.println("inserisci voto (tra 1 e 10, -1 per uscire)");
            voto = scanner.nextInt();
            if(voto == -1){
                break;
            }
            else if(voto < 1 || voto > 10){
                System.out.println("voto errato");
                continue;
            }
            somma += voto;
            count += 1;
        }
        media = somma / count;
        System.out.println("la media è " + media);
    }
}
