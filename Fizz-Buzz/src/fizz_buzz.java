import java.util.Scanner;

public class fizz_buzz {
static String resultadoFizzBuzz(int numero1){
  if (numero1 % 5 == 0 && numero1 % 3 == 0) {
    return "fizz-buzz";
  }
  if (numero1 % 3 == 0) {
    return "fizz";
  }
  if (numero1 % 5 == 0) {
    return"buzz";
  }
  return "no cumple con ninguno";
}
  public static void main(String[] args) {
    Scanner scaner = new Scanner(System.in);
    int numero1;
    String resultado;
    System.out.println(
        "Este progarama mostrrá la plabra (fizz) si el numero digitado es multiplo de 3, si el valor digitado es multiplo de 5 5 se mostrara (buzz) y si es de ambos se mostrará fizz-buzz");
    System.out.println("digiste el valor entero a evaluar");
    numero1 = scaner.nextInt();
    resultado= resultadoFizzBuzz(numero1);
    System.out.println(resultado);
   /* if (numero1 % 5 == 0 && numero1 % 3 == 0) {
      System.out.println("fizz-buzz");
    } else if (numero1 % 3 == 0) {
      System.out.println("fizz");
    } else if (numero1 % 5 == 0) {
      System.out.println("buzz");
    }*/

  }

}
