package com.tienda.App.repository;

import com.tienda.App.Model.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFacturaRepository extends JpaRepository<Factura, Long> {
}
