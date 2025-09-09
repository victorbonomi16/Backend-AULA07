package com.example.Exercicio03;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class EstudanteService {
    private final Map<Integer, Estudante> bancoDeEstudantes = new HashMap<>();

    public Estudante salvar(Estudante estudante) {
        bancoDeEstudantes.put(estudante.getCodigo(), estudante);
        return estudante;
    }

    public List<Estudante> listarTodos() {
        return new ArrayList<>(bancoDeEstudantes.values());
    }

    public Estudante buscarPorCodigo(int codigo) {
        return bancoDeEstudantes.get(codigo);
    }
}

