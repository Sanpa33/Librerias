package Servicios;

import java.util.Date;
import java.util.Scanner;

public class FechaService {

    public Date fechaNacimiento() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu fecha de nacimiento (dd mm aaaa): ");
        int dia = sc.nextInt();
        int mes = sc.nextInt() - 1; //Los meses en Date van de 0 a 11
        int anio = sc.nextInt() - 1900; //Se resta 1900 porque Date cuenta los años desde 1900
        Date fecha = new Date(anio, mes, dia);
       
        return fecha;
    }

    public Date fechaActual() {
        Date fechaActual = new Date();
        return fechaActual;
    }

    public int diferencia(Date fecha1, Date fecha2) {

        int aniosDiferencia = fecha2.getYear() - fecha1.getYear();
        // Si la fecha2 está antes que fecha1, hay que restar un año
        if (fecha2.getMonth() < fecha1.getMonth() || (fecha2.getMonth() == fecha1.getMonth() && fecha2.getDate() < fecha1.getDate())) {
            aniosDiferencia--;
        }
        return aniosDiferencia;
    }

    public static void main(String[] args) {

        FechaService fechaService = new FechaService();

        Date fechaNacimiento = fechaService.fechaNacimiento();

        System.out.println("Tu fecha de nacimiento es: " + fechaNacimiento);

        
        
        Date fechaActual = fechaService.fechaActual();
        
        System.out.println("La fecha actual es: "+ fechaActual);
        
        int edad = fechaService.diferencia(fechaNacimiento, fechaActual);
        
        System.out.println("Tu edad es: " + edad);

    }

}
