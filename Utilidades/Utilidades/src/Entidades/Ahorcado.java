package Entidades;

import java.util.Scanner;

public class Ahorcado {

    String[] palabra;
    int letrasEncontradas;
    int cantJugadas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int letrasEncontradas, int cantJugadas) {
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.cantJugadas = cantJugadas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getCantJugadas() {
        return cantJugadas;
    }

    public void setCantJugadas(int cantJugadas) {
        this.cantJugadas = cantJugadas;
    }
    
}
