package com.bootcampml.hello;

import java.util.List;

public class Alumno {
    private String nombre;
    private List<Asignatura> asignaturas;

    public Alumno(String nombre, List<Asignatura> asignaturas) {
        this.nombre = nombre;
        this.asignaturas = asignaturas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
    public double CalcularPromedio(){
        double suma=0;
        for (Asignatura a: asignaturas) {
            suma+= a.getNota();
        }
        return suma/ (double) asignaturas.size();
    }
}
