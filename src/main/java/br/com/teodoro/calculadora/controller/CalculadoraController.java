package br.com.teodoro.calculadora.controller;

import br.com.teodoro.calculadora.exceptions.InvalidNumberOperationException;
import br.com.teodoro.calculadora.model.Calculadora;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class CalculadoraController {

    @RequestMapping(value = "/sum", method = RequestMethod.GET)
    public float sum(@RequestParam("n1") String n1, @RequestParam("n2") String n2) {
        if(isNull(n1)||isNull(n2)){
            throw new InvalidNumberOperationException("Please, put the numbers");
        }
        if(!isNumeric(n1)||!isNumeric(n2)){
            throw new InvalidNumberOperationException("Please, set valid numeric values");
        }
        return Calculadora.sum(Float.parseFloat(n1), Float.parseFloat(n2));
    }

    @RequestMapping(value = "/sub", method = RequestMethod.GET)
    public float minus(@RequestParam("n1") String n1, @RequestParam("n2") String n2) {
        if(isNull(n1)||isNull(n2)){
            throw new InvalidNumberOperationException("Please, put the numbers");
        }
        if(!isNumeric(n1)||!isNumeric(n2)){
            throw new InvalidNumberOperationException("Please, set valid numeric values");
        }
        return Calculadora.sub(Float.parseFloat(n1), Float.parseFloat(n2));
    }

    @RequestMapping(value = "/mult", method = RequestMethod.GET)
    public float mult(@RequestParam("n1") String n1, @RequestParam("n2") String n2) {
        if(isNull(n1)||isNull(n2)){
            throw new InvalidNumberOperationException("Please, put the numbers");
        }
        if(!isNumeric(n1)||!isNumeric(n2)){
            throw new InvalidNumberOperationException("Please, set valid numeric values");
        }
        return Calculadora.mult(Float.parseFloat(n1), Float.parseFloat(n2));
    }

    @RequestMapping(value = "/div", method = RequestMethod.GET)
    public float div(@RequestParam("n1") String n1, @RequestParam("n2") String n2) {
        if(isNull(n1)||isNull(n2)){
            throw new InvalidNumberOperationException("Please, put the numbers");
        }
        if(!isNumeric(n1)||!isNumeric(n2)) {
            throw new InvalidNumberOperationException("Please, set valid numeric values");
        }
        return Calculadora.div(Float.parseFloat(n1), Float.parseFloat(n2));
    }

    public boolean isNumeric(String value){
        try{
            Float.parseFloat(value);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean isNull(String value) {
        if (value.isBlank()) {
            return true;
        }else{
            return false;
        }
    }
}
