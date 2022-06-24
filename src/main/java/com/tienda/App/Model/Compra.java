package com.tienda.App.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "compras")
public class Compra  implements Serializable {

    private static final long serialVersionUID = -2146267496625147118L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "fecha_compra")
    private LocalDate fechaCompra;

    private Boolean enabled; // campo para el estado de la compra


    @ManyToMany(mappedBy = "compras")
    private List<Usuario> usuarios;

    @JoinColumn(name = "factura_id")
    @OneToOne(fetch = FetchType.LAZY)
    private Factura facturas;

    /*
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "compras_factura",
            joinColumns =
                    {@JoinColumn(name = "compras_id")},
            inverseJoinColumns =
                    {@JoinColumn(name = "factura_id")}
    )
    private List<Factura> factura;*/
    /*
     Relacion con la tabla usuarios para decir que un usuario hace muchas compras
*/

    @OneToMany(mappedBy = "compras", cascade = CascadeType.ALL)
    private List<Producto> productos;


    public Compra() {
    }

    public Compra(Long id, LocalDate fechaCompra, Boolean enabled) {
        this.id = id;
        this.fechaCompra = fechaCompra;
        this.enabled = enabled;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
