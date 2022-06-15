/*package com.generation.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.generation.models.Usuario;
@Controller
@RequestMapping("/registro")
public class RegistroController {
    //ruta para desplegar jsp
    @RequestMapping
    public String registro(@ModelAttribute("usuario") Usuario usuario
    ){
        return "registro.jsp";
    }

    //ruta para capturar los datos del formulario
    @PostMapping("/usuario/respaldo")
    public String registroUsuario(@RequestParam(value="gato") String nombre, 
    @RequestParam(value="apellido") String apellido,
    @RequestParam(value="edad") String edad){

    System.out.println("estamos en el método de registro de usuario");
    System.out.println("parámetro gato" + nombre);
    System.out.println("parámetro apellido" + apellido);
    System.out.println("parámetro edad" + edad);
        return "registro.jsp";
    
    }

    @PostMapping("/usuario")
    public String guardarUsuario(@Valid @ModelAttribute("usuario") Usuario usuario, BindingResult resultado, 
    Model model){
        
        if(resultado.hasErrors()){//capturando si existe el error en el ingreso de datos, desde el jsp
            model.addAttribute("msgError", "Los datos no son correctos");
            return "registro.jsp";
        }
        System.out.println(usuario.getNombre() + ", "+ usuario.getApellido() + ", " + usuario.getEdad());
        return "registro.jsp";
    }
}
*/