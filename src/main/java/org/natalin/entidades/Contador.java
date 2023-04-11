package org.natalin.entidades;

public class Contador extends Empleado{

    public Contador() {
    }

    public Contador(String nombre, double sueldo) {
        super(nombre, sueldo);
    }



    @Override
    public String mostrarDatos() {

        return "El nombre del contador es : " + super.getNombre() + ", y su sueldo es de: " + super.getSueldo();
    }

}
