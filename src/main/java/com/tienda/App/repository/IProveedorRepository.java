package com.tienda.App.repository;

import com.tienda.App.Model.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProveedorRepository extends JpaRepository<Proveedor, Long > {
}
