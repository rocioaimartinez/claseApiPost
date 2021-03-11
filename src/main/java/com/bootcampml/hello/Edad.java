package com.bootcampml.hello;

import java.time.LocalDate;
import java.time.Period;

public class Edad {
    private Integer dia;
    private Integer mes;
    private Integer año;

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public Edad(Integer dia, Integer mes, Integer año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public Edad() {
    }

    public int calcularEdad(){
        Period edad;

        try{
            LocalDate fecha= LocalDate.of(año, mes, dia);
            edad= Period.between(fecha, LocalDate.now());
            return edad.getYears();
        }catch (Exception e){
            System.out.println(e);
            return 0;
        }
    }
}
