package Entidades;

import java.util.Scanner;

public class DoceMeses {

    public static void main(String[] args) {

        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

        String mesSecreto = meses[9];

        Scanner sc = new Scanner(System.in);
        String intento;

        do {
            System.out.println("Adivine el mes secreto");
            intento = sc.nextLine();

            if (intento.equals(mesSecreto)) {

                System.out.println("Adivinaste!");

            } else {

                System.out.println("No adivinaste");

            }

        } while (!intento.equals(mesSecreto));  // repasar el uso del " ! "

    }

}
