package com.tienda.App.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "productos")
public class Producto  implements Serializable {

    private static final long serialVersionUID = 4869166795260093318L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private long foto;

    private int stock;

        /*
     tabla padre para  hacer la relacion y se pretende decir que muchos productos estan en una compra
*/

    @ManyToOne()
    @JoinColumn(name = "producto_id")
    private Compra compras;


    @ManyToOne()
    @JoinColumn(name = "categoria_id")
    private Categoria  categoria;



}
