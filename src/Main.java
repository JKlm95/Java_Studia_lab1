import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */


        Scanner pierwszaLiczba = new Scanner(System.in);
        Scanner drugaliczba = new Scanner(System.in);
        System.out.println("podaj pierwsza liczbe");
        int a = pierwszaLiczba.nextInt();
        System.out.println("podaj druga liczbe");
        int b = drugaliczba.nextInt();



        if (a > b){
            System.out.println(a + " jest większe od " + b);
        }else if (a == b){
            System.out.println(a + " jest równe " + b);
        }
        else {
            System.out.println(b + " jest większe od " + a);
        }






    }
}
