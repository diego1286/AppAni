package com.tienda.App.repository;

import com.tienda.App.Model.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICompraRepository extends JpaRepository<Compra, Long> {
}
