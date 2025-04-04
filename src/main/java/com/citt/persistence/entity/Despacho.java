package com.citt.persistence.entity;

import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDate;


@Data
public class Despacho {
    private Long idDespacho;
    private LocalDate fechaDespacho;
    private String patenteCamion;
    private int intento;
    private Long idCompra;
    private String direccionCompra;
    private Long valorCompra;
}
