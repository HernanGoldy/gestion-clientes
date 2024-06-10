package com.bit.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "clientes")
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_alta")
    private LocalDate fechaAlta;
    @Column(name = "número_cliente")
    private Integer numeroCliente;
    @Column(name = "número_documento")
    private Integer numeroDocumento;
    private String apellido;
    private String nombres;
    @Column(name = "nombre_calle")
    private String nombreCalle;
    @Column(name = "número_calle")
    private Integer numeroCalle;
    private String piso;
    private String departamento;
    @Column(name = "nombre_edificio")
    private String nombreEdificio;
    private String manzana;
    private String casa;
    @Column(name = "entre_calle_1")
    private String entreCalle1;
    @Column(name = "entre_calle_2")
    private String entreCalle2;
    @Column(name = "sobre_calle")
    private String sobreCalle;
    @Column(name = "descripción_casa")
    private String descripcionCasa;
    private String barrio;
    private String ciudad;
    private String provincia;
    private String pais;
    @Column(name = "coordenadas_google_maps")
    private String coordenadasGoogleMaps;
    @Column(name = "teléfono_fijo")
    private String telefonoFijo;
    @Column(name = "teléfono_móvil_1")
    private String telefonoMovil1;
    @Column(name = "teléfono_móvil_2")
    private String telefonoMovil2;
    private String email;
    private String instagram;
    private String facebook;
}
