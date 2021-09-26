import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */


        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */

        String imie;
        String nazwisko;
        int wiek;
        int nrIndex;

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj swoje imie:");
        imie = scan.next();
        System.out.println("Podaj swoje nazwisko:");
        nazwisko = scan.next();
        System.out.println("Podaj wiek:");
        wiek = scan.nextInt();
        System.out.println("Podaj nr index:");
        nrIndex = scan.nextInt();
        System.out.println("imię: " + imie + ", nazwisko: " + nazwisko + ", wiek: " + wiek + ", nr index: " + nrIndex);

        System.out.printf("imię: " + imie + ", nazwisko: " + nazwisko + ", wiek: " + wiek + ", nr index: " + nrIndex);


        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        int pierwsza;
        int druga;
        System.out.println("Podaj pierwsza liczbe");
        pierwsza = a.nextInt();
        System.out.println("Podaj druga liczbe");
        druga = b.nextInt();
        System.out.println("dodawanie: " + (pierwsza + druga));
        System.out.println("odejmowanie: " + (pierwsza - druga));
        System.out.println("mnożenie: " + (pierwsza * druga));
        System.out.println("dzielenie: " + (pierwsza / druga));
        System.out.println("modulo pierwsza liczba: " + pierwsza%2);
        System.out.println("modulo druga liczba: " + druga%2);




    }
}
