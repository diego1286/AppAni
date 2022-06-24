package com.tienda.App.repository;

import com.tienda.App.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository  extends JpaRepository<Usuario, Long> {

}
