//System do obliczania punktów. Użytkownik wprowadza po kolei 3 ilości, punkty za styl,punkty za efekty i punkty ze rezultat. Punkty za styl pomnóż przez 0.2; punkty za efekty przez 0.3; a punkty za rezultat przez 0.5 i wydrukuj sumę tych działań.

import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {

        Scanner scan = new Scanner(System.in);
        double styl = scan.nextDouble() * 0.2;
        double efekty = scan.nextDouble() * 0.3;
        double rezultat = scan.nextDouble() * 0.5;
        double suma = styl+efekty+rezultat;
        System.out.println(suma);
    }

}