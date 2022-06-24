package com.tienda.App.servis;

import java.util.List;

import com.tienda.App.Model.Producto;
import com.tienda.App.repository.IProductoRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public class userServis {
    
    @Autowired
    IProductoRepository usuarios;// usuario es un variable local para el metodo de userservis para guardar usuarios para poder llamar los metodos del jparepository
    
    public List<Producto> listarusuarios() { // en esta clase se instala el servicio para crear los metodos de los crude
        // utilizando los metodos del mismo 
    return  usuarios.findAll();
    }


}
