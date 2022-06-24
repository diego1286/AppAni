package com.tienda.App.Model;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "facturas")
public class Factura  implements Serializable {

    private static final long serialVersionUID = -525799290591842463L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_compra")
    private LocalDate fechaCompra;

    @OneToOne(mappedBy = "facturas", cascade = CascadeType.ALL, fetch = FetchType.LAZY)// mapeo con la entidad usuario
    private Compra compras;

    public Factura() {
    }

}


