package com.example.Exercicio01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExerciciosAula07Controller {
    @GetMapping("/recomendar")
    public String recomendarDestino(@RequestParam String clima, @RequestParam String estilo) {
        if (clima.equalsIgnoreCase("calor") && estilo.equalsIgnoreCase("natureza")) {
            return "Rio de Janeiro";
        } else if (clima.equalsIgnoreCase("calor") && estilo.equalsIgnoreCase("cultura")) {
            return "Salvador";
        } else if (clima.equalsIgnoreCase("frio") && estilo.equalsIgnoreCase("montanha")) {
            return "Gramado";
        } else if (clima.equalsIgnoreCase("frio") && estilo.equalsIgnoreCase("historia")) {
            return "Curitiba";
        } else {
            return "Destino não encontrado para essa combinação.";
        }
    }
}