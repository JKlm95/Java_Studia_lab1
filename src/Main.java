import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */
        Scanner w = new Scanner(System.in);
        System.out.println("Podaj swoj wiek");
        int wiek = w.nextInt();
        if (wiek%3 == 0){
            System.out.println("Podzielny 3");
        }
        else System.out.println("Niepodzielny przez 3");


        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */


        Scanner indNum = new Scanner(System.in);
        System.out.println("Podaj nr index");
        int numInd = indNum.nextInt();
        int wynik = (numInd % 2 == 0)? 0 : 1;
        if (wynik == 0){
            System.out.println("Nr index parzysty");
        }else System.out.println("Nr index nieparzysty");





        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */

        Scanner liczba = new Scanner(System.in);
        System.out.println("Podaj liczbę");

        float l = liczba.nextFloat();

        if (l < 10){
            System.out.println("liczba mniejsza od 10");
        }else if (l == 10){
            System.out.println("liczba = 10");
        }
        else{
            System.out.println("liczba wieksza od 10");
        }

    }
}
