import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */

        double[] tab = new double[5];
        for (int i = 0; i < tab.length; i++){
            tab[i] = i + 3.5;
        }
        for (int i = 0; i < tab.length; i++){
            System.out.println(tab[i] + " ");
        }



    }
}
