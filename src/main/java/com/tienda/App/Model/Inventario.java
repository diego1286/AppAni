package com.tienda.App.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "inventarios")
public class Inventario implements Serializable {

    private static final long serialVersionUID = 4208617253237538123L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

    @Column(name = "fecha_inventario")
    private LocalDate fechaInventario;

    private Long Stock;

    @Column(name="estado", nullable = false)
    private boolean estado;

    @OneToMany(mappedBy = "inventarios", cascade = CascadeType.ALL)
    private List<Categoria>  categoria;// relacion con tabla categorias el mappedBy genera direccion bidireccional


    @OneToMany(mappedBy = "inventarios", cascade = CascadeType.ALL)
    private List<Proveedor>  proveedores;// relacion con tabla de provedores


}
