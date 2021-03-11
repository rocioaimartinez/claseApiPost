package com.bootcampml.hello;

import java.util.List;

public class Casa {
    private String nombre;
    private String direccion;
    private List<Habitacion> habitaciones;

    public Casa(String nombre, String direccion, List<Habitacion> habitaciones) {

        this.nombre = nombre;
        this.direccion = direccion;
        this.habitaciones = habitaciones;
    }

    public Casa() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }
    public double supTotal(){
        double total=0;
        for (Habitacion h: habitaciones) {
            total+= h.calcularSup();
        }
        return total;
    }
    public double getValor(){
        return supTotal() * 800;
    }
    public Habitacion habitacionMayor(){
        Habitacion mayor= new Habitacion();

        for (Habitacion h : habitaciones) {

            if(h.calcularSup() > mayor.calcularSup()){
                mayor= h;
            }
        }
        return mayor;
    }
    public String metrosCuadrados(){
        String resultado="";
        for (Habitacion h: habitaciones) {
            resultado+= h.toString() + "\n";
        }
        return resultado;
    }
}
