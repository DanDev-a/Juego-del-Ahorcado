import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) {
        
        //Clase scanner para que el usuario escriba
        Scanner teclado = new Scanner(System.in);

        //Declaraciones y asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentosFallidos = 0;
        int intentos = 0;
        boolean palabraAdivinada = false;         

        //Arreglos:
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        //Estructura de COntrol de tipo Iterativa
        for(int i = 0; i<palabraSecreta.length(); i++){
            letrasAdivinadas [i]  = '_';
        }

        //Estructura de COntrol de tipo Iterativa
        while(!palabraAdivinada && intentos < intentosMaximos){
             
            System.out.println("Pañabra a advinar: " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " letras)");

            System.out.println("Introduce una letra por favor");

            //Usamos la clase scanner para pedir una letra
            char letra = Character.toLowerCase(teclado.next().charAt(0));

            boolean letraCorrecta = false;

            for(int i = 0; i < palabraSecreta.length(); i++){
                //Estrcutura de control condicional
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true; 
                }
            }    

                if(!letraCorrecta){
                    intentos++;
                    intentosFallidos++;
                    System.out.println("Letra Incorrecta!!.. te quedan " + (intentosMaximos - intentos) + " intentos.") ;
                }

                if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                    palabraAdivinada = true;
                    System.out.println("Felicidades, has adivinado la palbra secreta: " + palabraSecreta);
                }
                dibujarAhorcado(intentosFallidos);
                System.out.println(); // Salto de línea para claridad entre turnos
            }
            if (!palabraAdivinada) {
                System.out.println("Que pena... te haz quedado sin intentos.  GAME OVER ");
            }
        teclado.close();
    }
    private static void dibujarAhorcado(int intentosFallidos) {

        //Parte grafica de consola
        switch (intentosFallidos){
            case 0:
                    System.out.println(" _____ ");
                    System.out.println(" |   | ");
                    System.out.println(" |     ");
                    System.out.println(" |     ");
                    System.out.println(" |     ");
                    System.out.println("_|_    ");
                    break;
            case 1:
                    System.out.println(" _____ ");
                    System.out.println(" |   | ");
                    System.out.println(" |   O ");
                    System.out.println(" |     ");
                    System.out.println(" |     ");
                    System.out.println("_|_    ");
                    break;
            case 2:
                    System.out.println(" _____ ");
                    System.out.println(" |   | ");
                    System.out.println(" |   O ");
                    System.out.println(" |   | ");
                    System.out.println(" |     ");
                    System.out.println("_|_    ");
                    break;
            case 3:
                    System.out.println(" _____ ");
                    System.out.println(" |   | ");
                    System.out.println(" |   O ");
                    System.out.println(" |  /| ");
                    System.out.println(" |     ");
                    System.out.println("_|_    ");
                    break;
            case 4:
                    System.out.println(" _____ ");
                    System.out.println(" |   | ");
                    System.out.println(" |   O ");
                    System.out.println(" |  /|\\");
                    System.out.println(" |     ");
                    System.out.println("_|_    ");
                    break;
            case 5:
                    System.out.println(" _____ ");
                    System.out.println(" |   | ");
                    System.out.println(" |   O ");
                    System.out.println(" |  /|\\");
                    System.out.println(" |  /  ");
                    System.out.println("_|_    ");
                    break;
            case 6:
                    System.out.println(" _____ ");
                    System.out.println(" |   | ");
                    System.out.println(" |   O ");
                    System.out.println(" |  /|\\");
                    System.out.println(" |  / \\");
                    System.out.println("_|_    ");
                    break;  
        }
    }
}

