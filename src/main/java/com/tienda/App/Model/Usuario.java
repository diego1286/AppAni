package com.tienda.App.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="usuarios")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1975596775335290666L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// se genera el id autoincrementable desde el codigo para base de datos 
    @Column(name="id")
    private  Long  id;

    @Column(name="nombre",length = 50)
    private  String nombre;

    @Column(name="apellido",length = 50)
    private String apellido;

    @Column(name="cedula",length = 25)
    private String cedula;

    @Column(name="direccion",length = 25)
    private String direccion;

    @Column( nullable = false, length = 250)
    private String password;

    @Column(name="email")
    private String email;

    @Column(name="estado", nullable = false)
    private boolean estado;
/*
se debe relacionar para el mapeo de uno a uno en la tabla tipo usuario
se pretende decir que un usuario es un tipo de usuario nada mas
ejemplo un usuario es administrador
 */
@ManyToMany(fetch = FetchType.LAZY)
@JoinTable(
     name = "roles_usuario",
        joinColumns =
                {@JoinColumn(name = "usuarios_id")},
        inverseJoinColumns =
                {@JoinColumn(name = "rol_id")}
)
    private List<Rol> roles;
/*
tabla padre aca se quiere decir que un usuario hace muchas compras
por eso es la relacion de muchos a michos con la tabla compras
 */
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "compras_usuarios",
            joinColumns =
                    {@JoinColumn(name = "usuarios_id")},
            inverseJoinColumns =
                    {@JoinColumn(name = "compras_id")}
    )
    private List<Compra> compras;// digo que muchos usuarios hacen muchas compras


    public Usuario() {
    }

    public Usuario(Long id, String nombre, String apellido, String cedula,
                   String direccion, String password, String email, boolean estado,
                   Rol tipoUsuario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.password = password;
        this.email = email;
        this.estado = estado;
        this.roles = (List<Rol>) tipoUsuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Rol getTipoUsuario() {
        return (Rol) roles;
    }

    public void setTipoUsuario(Rol tipoUsuario) {
        this.roles = (List<Rol>) tipoUsuario;
    }
}
