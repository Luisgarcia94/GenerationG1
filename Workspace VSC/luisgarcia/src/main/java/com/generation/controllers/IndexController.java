package com.generation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

//http://localhost:8080/
@RequestMapping("/")
public String index(){
    return "Hola mundo G1";
}

/* Enrutamientos */
//http://localhost:8080/usuario
@RequestMapping("/usuario")
public String usuario(){
    return "estamos en la url usuario";
}

@RequestMapping("/usuario/inscrito")
public String inscrito(){
    return "estamos en la url usuario/inscrito";
}

@RequestMapping("/cliente/registrado")
public String cliente(){
    return "Ruta de cliente";
}

@RequestMapping(value = "/proveedor/registrado", method = RequestMethod.GET)
public String proveedor(){
    return "Ruta de proveedor";
}
}
