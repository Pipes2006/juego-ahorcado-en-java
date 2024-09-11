import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
    //clase  que permita al usuario esccribir en consola

    Scanner scanner=new Scanner(System.in);

    //asignacion de cariables
    String palabraSecreta="inteligencia";
    int intentosMaximos=10;
    int intentos=0;
    boolean palabraAdivinada=false;

    //arreglos
    char[] letrasAdivinadas=new char[palabraSecreta.length()];

    //estructura de control de tipo iterativa

    for (int i = 0; i < letrasAdivinadas.length; i++) {
        letrasAdivinadas[i]='_';
        
    }
    //estructura de control de tipo iterativa
    while (!palabraAdivinada && intentos<intentosMaximos) {
        System.out.println("palabra a adivinar:"+ String.valueOf(letrasAdivinadas));

        System.out.println("introduce una letra por favor");

        char letra=scanner.next().charAt(0);

         boolean letraCorrecta=false;

         for (int i = 0; i < palabraSecreta.length(); i++) {

            //estructura de control control  
            if (palabraSecreta.charAt(i)==letra) {
                letrasAdivinadas[i]=letra;
                letraCorrecta=true;
                
            }
            
         }

         if (letraCorrecta) {
            intentos++;
            System.out.println("incorrrecto, te quedan:"+(intentosMaximos-intentos)+"intentos");


         }

         if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
            palabraAdivinada=true;
            System.out.println("felicidades , haz adivinado la palabra secreta"+palabraSecreta);
         }

         if (palabraAdivinada) {
            System.out.println("te haz quedado sin palabras , haz perdido");
            
         }
         
    }
    scanner.close();

    }
}
