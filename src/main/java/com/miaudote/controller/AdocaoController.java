package com.miaudote.controller;

import com.miaudote.model.Adocao;
import com.miaudote.repository.AdocaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adocao")
public class AdocaoController {

    @Autowired
    private AdocaoRepository adocaoRepository;

    @PostMapping
    public Adocao createAdocao(@RequestBody Adocao adocao) {
        return adocaoRepository.save(adocao);
    }

    @GetMapping
    public List<Adocao> getAllAdocoes() {
        return adocaoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Adocao getAdocaoById(@PathVariable String id) {
        return adocaoRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Adocao updateAdocao(@PathVariable String id, @RequestBody Adocao updatedAdocao) {
        updatedAdocao.setId(id);
        return adocaoRepository.save(updatedAdocao);
    }

    @DeleteMapping("/{id}")
    public void deleteAdocao(@PathVariable String id) {
        adocaoRepository.deleteById(id);
    }
}
