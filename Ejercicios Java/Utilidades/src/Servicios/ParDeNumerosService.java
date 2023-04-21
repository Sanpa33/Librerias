package Servicios;

import Entidades.ParDeNumeros;

//Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además implementar los siguientes métodos:
//Método mostrarValores que muestra cuáles son los dos números guardados.
//Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
//Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se deben redondear ambos valores.
//Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
public class ParDeNumerosService {

    private ParDeNumeros p;

    public ParDeNumerosService() {

        this.p = new ParDeNumeros();

    }

    public void mostrarValores() {

        System.out.println("Los numeros guardados son: " + p.getNum1() + " y " + p.getNum2());

    }

    public double devolverMayor() {


        if (p.getNum1() > p.getNum2()) {

            return p.getNum1();

        } else {

           return p.getNum2();

        }
    }

//    public double calcularPotencia() {
//
//        double mayor,menor;
//        mayor = this.devolverMayor();
//        menor = 
//        double retorno;
//        retorno = Math.pow(this.devolverMayor(), 2);
//
//        return 0;
//    }

}
