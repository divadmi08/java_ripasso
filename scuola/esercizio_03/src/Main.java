import java.util.Scanner;

public class Main {

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

        int s;
        System.out.println("inserisci un numero");
        s = scanner.nextInt();

        String risultato = switch (s) {
            case 2, 42343242, 1 -> "hai indovinato";
            default -> "non hai indovinato";
        };
        System.out.println(risultato);
    }
}
