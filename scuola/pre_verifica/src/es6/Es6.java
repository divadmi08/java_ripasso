package es6;

import java.util.Scanner;
public class Es6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci operazione che vuoi fare es(4 + 5)");
        int n1 = scanner.nextInt();
        String operatore = scanner.next();
        int n2 = scanner.nextInt();
        scanner.nextLine();

        float risultato = switch (operatore){
            case "+" -> n1 + n2;
            case "-" -> n1 - n2;
            case "*" -> n1 * n2;
            case "/" -> n1 / n2;
            default -> 0.0f;
         };
        System.out.println(risultato);

    }
}
