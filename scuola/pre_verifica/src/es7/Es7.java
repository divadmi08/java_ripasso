package es7;
import java.util.Scanner;
public class Es7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci un voto da 1 a 10");
        int s = scanner.nextInt();

        String valutezione = switch(s){
            case 1,2,3,4 -> "insufficiente";
            case 5 -> "mediocre";
            case 6 -> "sufficiente";
            case 7,8 -> "buono";
            case 9 -> "distinto";
            case 10 -> "ottimo";
            default -> "voto fuori range";
        };
        System.out.println(valutezione);
    }
}
