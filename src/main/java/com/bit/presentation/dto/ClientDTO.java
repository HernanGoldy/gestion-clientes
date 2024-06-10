package com.bit.presentation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO {

    private Long id;
    private LocalDate fechaAlta;
    private Integer numeroCliente;
    private Integer numeroDocumento;
    private String apellido;
    private String nombres;
    private String nombreCalle;
    private Integer numeroCalle;
    private String piso;
    private String departamento;
    private String nombreEdificio;
    private String manzana;
    private String casa;
    private String entreCalle1;
    private String entreCalle2;
    private String sobreCalle;
    private String descripcionCasa;
    private String barrio;
    private String ciudad;
    private String provincia;
    private String pais;
    private String coordenadasGoogleMaps;
    private String telefonoFijo;
    private String telefonoMovil1;
    private String telefonoMovil2;
    private String email;
    private String instagram;
    private String facebook;
}
