package br.com.industrack.indus_track_api.controller;

import br.com.industrack.indus_track_api.model.Ativo;
import br.com.industrack.indus_track_api.repository.AtivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("/api/ativos")
public class AtivoController {

    @Autowired
    private AtivoRepository repository;
    @GetMapping
    public List<Ativo> listarTodos() {
        return repository.findAll();
    }
    @PostMapping
    public Ativo criarAtivo(@RequestBody Ativo novoAtivo) {
        return repository.save(novoAtivo);
    }
}