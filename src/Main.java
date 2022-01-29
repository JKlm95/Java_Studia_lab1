import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        int zmiennaInt1;
        float zmiennaFloat;
        double zmiennaDouble;
        zmiennaInt1 = 1;
        zmiennaFloat = 21.4f;
        zmiennaDouble = 12345322;


        int liczbaA = 7;
        int liczbaB = 2;
        float liczbaX = 12.4f;
        float liczbaY = 2.3f;
        String s = "Ala ma kota";


        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */

        System.out.println("To jest liczba A: " + liczbaA + ", to jest liczba B: " + liczbaB + ", a to jest string s: " + s);


        /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        *  */
        System.out.println(liczbaA + liczbaB);
        System.out.println(liczbaA - liczbaA);
        System.out.println(liczbaA * liczbaB);
        System.out.println(liczbaA / liczbaB);
        System.out.println(liczbaA%2);
        System.out.println(liczbaB%2);
        System.out.println(liczbaX + liczbaY);
        System.out.println(liczbaX - liczbaY);
        System.out.println(liczbaX * liczbaY);
        System.out.println(liczbaX / liczbaY);
        System.out.println(liczbaX%2);
        System.out.println(liczbaY%2);



    }
}
