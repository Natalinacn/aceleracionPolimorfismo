package org.natalin.entidades;

public class Gerente extends Empleado{

    private String area;

    public Gerente() {
    }

    public Gerente(String area) {
        this.area = area;
    }

    public Gerente(String nombre, double sueldo, String area) {
        super(nombre, sueldo);
        this.area = area;
    }

    @Override
    public String mostrarDatos() {

        return super.mostrarDatos() + ", area:" + this.area;
    }



}
