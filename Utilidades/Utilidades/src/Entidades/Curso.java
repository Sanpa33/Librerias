package Entidades;

import java.util.Scanner;

public class Curso {

    String nombreCurso;
    double cantidadHorasPorDia;
    int cantidadDiasPorSemana;
    String turno;
    double precioPorHora;
    String[] alumnos = new String[5];

    public Curso() {
    }

    public Curso(String nombreCurso, double cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, double precioPorHora) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public double getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(double cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

//    Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases.
//    Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con un bucle,
//    solicitando en cada repetición que se ingrese el nombre de cada alumno.
    
    public void cargarAlumnos() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < alumnos.length; i++) {
            System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
            alumnos[i] = scanner.nextLine();
        }
    }

    public void crearCurso() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del curso: ");
        nombreCurso = scanner.nextLine();
        System.out.print("Ingrese la cantidad de horas por día: ");
        cantidadHorasPorDia = scanner.nextDouble();
        System.out.print("Ingrese la cantidad de días por semana: ");
        cantidadDiasPorSemana = scanner.nextInt();
        System.out.print("Ingrese el turno (mañana o tarde): ");
        turno = scanner.next();
        System.out.print("Ingrese el precio por hora: ");
        precioPorHora = scanner.nextDouble();
        cargarAlumnos();
    }

    public double calcularGananciaSemanal() {
        double gananciaSemanal = cantidadHorasPorDia * precioPorHora * cantidadDiasPorSemana * alumnos.length;
        return gananciaSemanal;
    }

}
