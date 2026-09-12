import java.util.Scanner;

public class Ejercicio2 {

  public static boolean evaluarPalindromo(int num) {
    int d1 = num / 10000;
    int d2 = (num / 1000) % 10;
    int d4 = (num / 10) % 10;
    int d5 = num % 10;
    if (d1 == d5 && d2 == d4) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int numero = 0;
    while (numero < 10000 || numero > 99999) {
      System.out.print("Ingresa un numero entero de cinco digitos y positivo: ");
      numero = teclado.nextInt();
      if (numero < 10000 || numero > 99999) {
        System.out.println(
          "Error: El numero no tiene cinco digitos. Intenta de nuevo."
        );
      }
    }
    if (evaluarPalindromo(numero)) {
      System.out.println("El numero " + numero + " es un palindromo.");
    } else {
      System.out.println("El numero " + numero + " no es un palindromo.");
    }
    teclado.close();
  }
}
