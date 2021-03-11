package com.bootcampml.hello;

public class Diploma {
    private String mensaje;
    private double promedio;
    private Alumno alumno;


    public Diploma(String mensaje, double promedio, Alumno alumno) {
        this.mensaje = mensaje;
        this.promedio = promedio;
        this.alumno = alumno;

    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }



}
