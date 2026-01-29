package com.restaurante.restaurante.service;

import com.restaurante.restaurante.model.Comida;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter @Setter
public class MenuRestaurante {

    private final List<Comida> comidas = new ArrayList<>();

    public MenuRestaurante() {}

    public void añadirComida(Comida comidaRestaurante) {
        this.comidas.add(comidaRestaurante);
    }

    public Comida buscarComidaPorId(Long id) {
        for (Comida comida : this.comidas) {
            if (Objects.equals(comida.getId(), id)) {
                return comida;
            }
        }
        return null;
    }

}
