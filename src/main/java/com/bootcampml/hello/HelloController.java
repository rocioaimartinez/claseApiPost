package com.bootcampml.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class HelloController {
    Morse m= new Morse();
    RomanEx r= new RomanEx();

    @GetMapping (path="/hola/{name}")
    public String sayHello(@PathVariable String name){

        return "Hello world from my first API " + name;
    }
    @GetMapping (path="/chau/{name}")
    public String sayGoodbye(@PathVariable String name){

        return "Goodbye " + name;
    }
    @GetMapping ("/romans/{nro}")
    public String castRoman(@PathVariable String nro){

        String numeroRomano=r.turnToRoman(Integer.parseInt(nro));

        return "El resultado es: " + numeroRomano;
    }

    @GetMapping ("/morse/{words}")
    public String turnToABC(@PathVariable String words){
        String result= m.morseToEnglish(words);
        return result;
    }

    @PostMapping("/calcular")
    public  String calcularCasa(@RequestBody Casa casa ) {
        double sup=0;
        try{
            sup= casa.supTotal();
        }catch(Exception e){
            e.printStackTrace();
        }

        return "La superfice total de la casa es= "+ sup;
    }
    @PostMapping("/precio")
    public  String getPrecio(@RequestBody Casa casa ) {

        return "El precio de la casa es= "+ casa.getValor();
    }
    @PostMapping("/habitacion")
    public Habitacion getMasGrande(@RequestBody Casa casa){
        return casa.habitacionMayor();
    }
    @PostMapping("/metrosCuadrados")
    public String getMetros(@RequestBody Casa casa){
        return casa.metrosCuadrados();
    }
    @PostMapping("edad")
    public String calcularEdad(@RequestBody Edad edad){

        return "Edad= " + edad.calcularEdad();
    }
    @PostMapping("promedio")
    public Diploma calcularPromedio(@RequestBody Alumno a){
        double promedio= a.CalcularPromedio();
        String resultado= "El promedio del alumno es: " + promedio +"\n";
        if(promedio>= 9){
            resultado+= " FELICITACIONES!";
        }
        Diploma dip= new Diploma(resultado,promedio, a);
        return dip;
    }
}
