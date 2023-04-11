package org.natalin;

import org.natalin.entidades.Contador;
import org.natalin.entidades.Empleado;
import org.natalin.entidades.Gerente;

public class Main {
    public static void main(String[] args) {


        Gerente objGerente = new Gerente();

        objGerente.setNombre("Naty");
        objGerente.setSueldo(80000);
        objGerente.setArea("Ventas");



        imprimir(objGerente);

        Empleado objContador = new Contador("Erika", 85000);

        imprimir(objContador);

    }

    public static void imprimir(Empleado empleado){

        System.out.println(empleado.mostrarDatos());


    }

}