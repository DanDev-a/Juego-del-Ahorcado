import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        
        //Clase scanner para que el usuario escriba
        Scanner teclado = new Scanner(System.in);

        //Declaraciones y asignaciones
        String palabraSecreta = "Inteligencia";
        final int intentosMaximos = 6;
        int intentos = 0;
        boolean palabraAdivinada = false;

        //Arreglos:
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        //Estructura de COntrol de tipo Iterativa
        for(int i = 0; i<palabraSecreta.length( ); i++){
            letrasAdivinadas [i]  = '_';
        }

        //Estructura de COntrol de tipo Iterativa
        while(!palabraAdivinada && intentos < intentosMaximos){
             
            System.out.println("Pañabra a advinar: " + String.valueOf(letrasAdivinadas));

            System.out.println("Introduce una letra por favor");

            //Usamos la clase scanner para pedir una letra
            char letra = teclado.next().charAt(0);

            boolean letraCorrecta = false;

            for(int i = 0; i < palabraSecreta.length(); i++){
                //Estrcutura de control condicional
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true; 
                }

                if(!letraCorrecta){
                    intentos++;
                    System.out.println("Letra Incorrecta!!.. te quedan " + (intentosMaximos - intentos) + " intentos.") ;
                }

                if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                    palabraAdivinada = true;
                    System.out.println("Felicidades, has adivinado la palbra secreta: " + palabraSecreta);
                }
            }

            if (!palabraAdivinada) {
                System.out.println("Que pena... te haz quedado sin intentos.  GAME OVER ");
            }

            teclado.close();
        }
    }
}
