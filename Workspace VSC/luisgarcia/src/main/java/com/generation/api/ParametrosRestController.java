package com.generation.api;

import java.security.MessageDigestSpi;

import org.eclipse.jdt.internal.compiler.ast.FalseLiteral;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api") //localhost:8080/api?fecha=20220613
public class ParametrosRestController {
    @RequestMapping("/")
    public String fecha(@RequestParam(value = "fecha") String fecha){
        return "la fecha es : " + fecha;
    }

    @RequestMapping("/seccion") //localhost:8080/api/seccion?modulo=5&seccion=3
    // deben estar los 2 parámetros
    public String seccion(@RequestParam(value = "modulo") String modulo,
    @RequestParam(value = "seccion") String seccion){
        return "el modulo es : " + modulo + " la seccion es : " + seccion;
    }

    /*Rutas con parámetros no obligatorios */

    @RequestMapping("/date")//localhost:8080/api/date?anio=2022&mes=6&dia=12
    public String capturarParametros(@RequestParam(value = "anio", required = false) String anio,
    @RequestParam(value = "mes", required = false) String mes,
    @RequestParam(value = "dia", required = false) String dia){

        if(anio != null){
        System.out.println("El año es : " + anio);
        }
        if(mes != null){
            System.out.println("El mes es : " + mes);
            }
            if(mes != null){
                System.out.println("El dia es : " + dia);
                }
        
        return "La fecha es " + anio + mes + dia;
    }

}
