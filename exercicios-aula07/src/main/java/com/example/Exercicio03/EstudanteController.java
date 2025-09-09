package com.example.Exercicio03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudantes")
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;

    @PostMapping
    public Estudante cadastrar(@RequestBody Estudante estudante) {
        return estudanteService.salvar(estudante);
    }

    @GetMapping
    public List<Estudante> listarTodos() {
        return estudanteService.listarTodos();
    }

    @GetMapping("/{codigo}")
    public Estudante buscarPorCodigo(@PathVariable int codigo) {
        return estudanteService.buscarPorCodigo(codigo);
    }
}

