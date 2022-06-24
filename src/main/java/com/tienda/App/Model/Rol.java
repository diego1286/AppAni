package com.tienda.App.Model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="roles")
public class Rol implements Serializable {

    private static final long serialVersionUID = 8862877877580569052L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;

    @Column(name="rol_usuario",nullable = false, length = 50)
    private String tipo_usuario;

    @ManyToMany(mappedBy = "roles", cascade = CascadeType.ALL, fetch = FetchType.LAZY)// mapeo con la entidad usuario
    private List<Usuario> usuarios;

    public Rol() {
    }

    public Rol(Long id, String tipo_usuario, Usuario usuarios) {
        this.id = id;
        this.tipo_usuario = tipo_usuario;
        this.usuarios = (List<Usuario>) usuarios;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public Usuario getUsuario() {
        return (Usuario) usuarios;
    }

    public void setUsuario(Usuario usuario) {
        this.usuarios = (List<Usuario>) usuarios;
    }
}
