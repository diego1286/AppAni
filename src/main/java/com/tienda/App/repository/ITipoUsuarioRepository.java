package com.tienda.App.repository;

import com.tienda.App.Model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITipoUsuarioRepository extends JpaRepository<Rol, Long> {
}
