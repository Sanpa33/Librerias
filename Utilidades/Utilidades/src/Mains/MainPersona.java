package Mains;

import Entidades.Persona;
import Servicios.PersonaService;
import java.util.Scanner;

public class MainPersona {

    public static void main(String[] args) {

        Persona persona = new Persona();
        PersonaService personaService = new PersonaService();

        Scanner sc = new Scanner(System.in);

        int edad;

        personaService.crearPersona(persona);

        System.out.println("Ingrese una edad");
        edad = sc.nextInt();

        System.out.println(personaService.menorQue(persona, edad));

        personaService.mostrarPersona(persona);

    }

}
