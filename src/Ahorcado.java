
// Ahorcado.java
import java.util.Scanner;
import java.util.Arrays;

public class Ahorcado {
   // variables
   public static void main(String[] args) {
      char palabra_ingresada;
      boolean letra_encontrada = false;
      int numero_de_intentos = 8;
      boolean palabra_completa = false;
      String palabra_oculta = "Ingeniero de sistemas";
      char[] progreso = new char[palabra_oculta.length()];
      // ingresamos el scanner que es por donde el usuario va a digitar la informacion
      Scanner sc = new Scanner(System.in);
      for (int i = 0; i < palabra_oculta.length(); i++) {
         if (palabra_oculta.charAt(i) == ' ') {
            progreso[i] = ' '; // Muestra espacios en blanco directamente
         } else {
            progreso[i] = '_'; // Oculta letras con guión bajo
         }
      }
      if (palabra_oculta == null || palabra_oculta.isEmpty()) {
         System.out.println("La palabra oculta no puede ser nula o vacía.");
         return;
      }
      if (numero_de_intentos <= 0) {
         System.out.println("has agotado todos tus intentos. !PERDEDOR!");
         return;
      }
   }

}