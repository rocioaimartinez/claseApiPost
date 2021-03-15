package com.bootcampml.hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


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
    public  ResponseEntity<String> getPrecio(@RequestBody Casa casa ) {

        return new ResponseEntity<String>("El precio de la casa es= "+ casa.getValor(), HttpStatus.OK);
    }
    @PostMapping("/habitacion")
    public ResponseEntity<Habitacion> getMasGrande(@RequestBody Casa casa){
        return new ResponseEntity<Habitacion>(casa.habitacionMayor(), HttpStatus.OK);
    }
    @PostMapping("/metrosCuadrados")
    public ResponseEntity<String> getMetros(@RequestBody Casa casa){

        return new ResponseEntity<String>(casa.metrosCuadrados(), HttpStatus.OK);
    }
    @PostMapping("edad")
    public ResponseEntity<String> calcularEdad(@RequestBody Edad edad){

        return new ResponseEntity<String>("Edad= " + edad.calcularEdad(), HttpStatus.OK);
    }
    @PostMapping("promedio")
    public ResponseEntity<Diploma> calcularPromedio(@RequestBody Alumno a){
        double promedio= a.CalcularPromedio();
        String resultado= "El promedio del alumno es: " + promedio + '\n';
        if(promedio>= 9){
            resultado+= " FELICITACIONES!";
        }
        Diploma dip= new Diploma(resultado,promedio, a);
        return new ResponseEntity<Diploma>(dip,HttpStatus.OK);
    }
}
