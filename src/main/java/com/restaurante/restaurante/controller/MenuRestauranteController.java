package com.restaurante.restaurante.controller;

import com.restaurante.restaurante.model.Comida;
import com.restaurante.restaurante.service.MenuRestaurante;
import org.springframework.web.bind.annotation.*;

@RestController
public class MenuRestauranteController {

    private final MenuRestaurante menuRestaurante = new MenuRestaurante();

    @GetMapping("/restaurante/menu/comida/{numero_menu}")
    @ResponseBody
    public Comida getMenuRestaurante(@PathVariable Long numero_menu) {
        this.menuRestaurante.añadirComida(new Comida(1L, "Milanesas con puré", 1500.00));
        this.menuRestaurante.añadirComida(new Comida(2L, "Matambre a la pizza", 2900.00));
        this.menuRestaurante.añadirComida(new Comida(3L, "Ensalada de frutas", 3000.00));

        return this.menuRestaurante.buscarComidaPorId(numero_menu);
    }

}
