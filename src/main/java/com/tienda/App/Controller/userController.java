package com.tienda.App.Controller;

import java.util.List;

import com.tienda.App.Model.Producto;
import com.tienda.App.repository.IProductoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // se hace esta anotacion para se que conozca como controladora 
@RequestMapping(value = "/user")
public class userController {

    @Autowired
    private IProductoRepository usuario;

    @GetMapping(value = "/list") // mapeo de las rutas
    public List<Producto> listUser() {// se crea apartir de la clase usermodel una list para areto

        System.out.println("consulta los usuarios todos");
        return usuario.findAll();
    }

    @GetMapping(value = "/save")// se crea el metodo void que no retorna nada 
    public void saveUser() {
        System.out.println("registro exitoso");
    }


}
