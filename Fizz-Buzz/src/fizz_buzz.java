import java.util.Scanner;

public class fizz_buzz {

  public static void main(String[] args) {
    Scanner scaner = new Scanner(System.in);
    int numero1;

    System.out.println(
        "Este progarama mostrrá la plabra (fizz) si el numero digitado es multiplo de 3, si el valor digitado es multiplo de 5 5 se mostrara (buzz) y si es de ambos se mostrará fizz-buzz");
    System.out.println("digiste el valor entero a evaluar");
    numero1 = scaner.nextInt();
    if (numero1 % 5 == 0 && numero1 % 3 == 0) {
      System.out.println("fizz-buzz");
    } else if (numero1 % 3 == 0) {
      System.out.println("fizz");
    } else if (numero1 % 5 == 0) {
      System.out.println("buzz");
    }

  }

}
