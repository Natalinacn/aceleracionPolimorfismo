package org.natalin;

import org.natalin.entidades.Empleado;
import org.natalin.entidades.Gerente;

public class Main {
    public static void main(String[] args) {


        Empleado objEmpleado = new Empleado();

        objEmpleado.setNombre("Naty");
        objEmpleado.setSueldo(80000);

        imprimir(objEmpleado);

        Gerente objGerente = new Gerente("Erika", 85000, "Ventas");

        imprimir(objGerente);

    }

    public static void imprimir(Empleado empleado){

        System.out.println("Datos del empleado: " + empleado.mostrarDatos());


    }

}