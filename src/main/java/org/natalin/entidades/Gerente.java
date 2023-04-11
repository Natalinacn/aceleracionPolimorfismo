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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String mostrarDatos() {

        return "El nombre del Gerente es : " + super.getNombre() + ", su sueldo es de: " + super.getSueldo() + " y pertenece al área " + this.area;
    }



}
