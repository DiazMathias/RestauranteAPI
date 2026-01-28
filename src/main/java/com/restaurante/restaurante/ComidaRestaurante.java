package com.restaurante.restaurante;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ComidaRestaurante {

    private Long id;
    private String descripcion;
    private Double costo;

    public ComidaRestaurante() {}

    public ComidaRestaurante(Long id, String descripcion, Double costo) {
        this.id = id;
        this.descripcion = descripcion;
        this.costo = costo;
    }

}
