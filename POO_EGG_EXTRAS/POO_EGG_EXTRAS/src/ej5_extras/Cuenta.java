package ej5_extras;

import java.util.Scanner;
//Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
//Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero
//del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después de
//realizar una transacción de retiro.

public class Cuenta {

    int saldo;
    String titular;

    public Cuenta() {
    }

    public void Informacion() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del titular");
        this.titular = entrada.nextLine();
        System.out.println("Ingrese el saldo");
        this.saldo = entrada.nextInt();

    }

    public void retirar_dinero() {

        Scanner entrada = new Scanner(System.in);
        int retirar;
        int resultado;

        System.out.println("Cuanto dinero desea retirar?");
        retirar = entrada.nextInt();

        resultado = (this.saldo) - retirar;

        

        if (resultado <= 0) {

            System.out.println("Tu saldo llego a 0");
            resultado = 0;

        }
        
        System.out.println("El Titular : " + this.titular);
        System.out.println("Pose en su cuenta despues del retiro: " + resultado);

    }

}
