package com.tienda.App.repository;

import com.tienda.App.Model.Producto;
import com.tienda.App.Model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoRepository extends JpaRepository<Producto, Long> {
    
}

