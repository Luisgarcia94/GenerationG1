package com.generation.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/var") //localhost:8080/var --->por default
public class PathVariablesRestController {
    //capturar variables desde la ruta o el path

    @RequestMapping("/anio/{a}/mes/{m}/dia/{d}")
    public String capturarVariablesPath(@PathVariable("a") String anio,
    @PathVariable("m") String mes,
    @PathVariable("d") String dia){

        return "La fecha es ";
    }
}
