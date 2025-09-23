package es5;

import java.util.Scanner;
public class Es5 {
    enum Giorni{
        LUNEDI,
        MARTEDI,
        MERCOLEDI,
        GIOVEDI,
        VENERDI,
        SABATO,
        DOMENICA
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero tra 1 e 7");
        int n = scanner.nextInt();
        String giorno = String.valueOf(switch (n) {
            case 1 -> Giorni.LUNEDI;
            case 2 -> Giorni.MARTEDI;
            case 3 -> Giorni.MERCOLEDI;
            case 4 -> Giorni.GIOVEDI;
            case 5 -> Giorni.VENERDI;
            case 6 -> Giorni.SABATO;
            case 7 -> Giorni.DOMENICA;
            default -> "giorno sbalgiato";
        });
        System.out.println(giorno);

    }
}
