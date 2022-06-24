package com.tienda.App.Model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "proveedores")
public class Proveedor implements Serializable {

    private static final long serialVersionUID = -8692074165461178658L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private String nombre;

    @Column(name = "nombre_empresa")
    private String empresa;

    private String direccion;

    private String telefono;


    @ManyToOne()
    @JoinColumn(name = "inventario_id")
    private Inventario  inventarios;

}
