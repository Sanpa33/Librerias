package ej3_extras;

//Crea una clase "Juego" que tenga un método "iniciar_juego"
import javax.swing.JOptionPane;

//que permita a dos jugadores jugar un juego de adivinanza de números.
//El primer jugador elige un número y el segundo jugador intenta adivinarlo.
//El segundo jugador tiene un número limitado de intentos y recibe una pista de
//"más alto" o "más bajo" después de cada intento.
//El juego termina cuando el segundo jugador adivina el número o se queda sin intentos.
//Registra el número de intentos necesarios para adivinar el número y el número de veces
//que cada jugador ha ganado.
public class Juego {

    private int player1;
    private int player2;

    public Juego() {
    }

    public void iniciar_juego() {

        int intentos = 0;
        player1 = Integer.parseInt(JOptionPane.showInputDialog("Primer Jugador ingrese un numero "));

        do {

            player2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo Jugador, adivine el numero del primer jugador "));

            intentos++;

            if (player2 < player1) {

                System.out.println("Mas alto");

            }
            if (player2 > player1) {

                System.out.println("Mas bajo");

            }
            if (player2 == player1) {

                break;

            }

        } while (intentos < 5);

        if (player2 == player1) {

            
            System.out.println("Adivinaste el numero!: " + player1 + " en " + intentos+" intentos");

        }

        if (player2 != player1) {

            System.out.println("Se te agotaron los intentos!");

        }

    }

}
