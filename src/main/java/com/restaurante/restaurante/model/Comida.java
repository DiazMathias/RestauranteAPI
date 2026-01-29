package com.restaurante.restaurante.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Comida {

    private Long id;
    private String descripcion;
    private Double costo;

    public Comida() {}

    public Comida(Long id, String descripcion, Double costo) {
        this.id = id;
        this.descripcion = descripcion;
        this.costo = costo;
    }

}
