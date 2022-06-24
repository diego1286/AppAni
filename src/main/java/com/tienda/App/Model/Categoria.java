package com.tienda.App.Model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "categorias")
public class Categoria implements Serializable {

    private static final long serialVersionUID = -9079251463950422911L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;


    @OneToMany(mappedBy = "compras", cascade = CascadeType.ALL)
    private List<Producto> productos;


    @ManyToOne()
    @JoinColumn(name = "inventario_id")
    private Inventario  inventarios;

}
 