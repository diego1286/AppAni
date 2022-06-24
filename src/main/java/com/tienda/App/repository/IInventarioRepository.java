package com.tienda.App.repository;

import com.tienda.App.Model.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IInventarioRepository extends JpaRepository<Inventario, Long> {
}
