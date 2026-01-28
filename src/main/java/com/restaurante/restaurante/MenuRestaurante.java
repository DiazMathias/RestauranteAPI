package com.restaurante.restaurante;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter @Setter
public class MenuRestaurante {

    private final List<ComidaRestaurante> comidas = new ArrayList<>();

    public MenuRestaurante() {}

    public void añadirComida(ComidaRestaurante comidaRestaurante) {
        this.comidas.add(comidaRestaurante);
    }

    public ComidaRestaurante buscarComidaPorId(Long id) {
        for (ComidaRestaurante comida : this.comidas) {
            if (Objects.equals(comida.getId(), id)) {
                return comida;
            }
        }
        return null;
    }

}
