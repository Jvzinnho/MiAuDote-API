package com.miaudote.controller;

import com.miaudote.model.Animal;
import com.miaudote.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/animais")
@CrossOrigin(origins = "*") // Para permitir acesso do app Android
public class AnimalController {

    @Autowired
    private AnimalRepository animalRepository;

    // Listar todos os animais
    @GetMapping
    public List<Animal> getAllAnimais() {
        return animalRepository.findAll();
    }

    // Buscar animal por ID
    @GetMapping("/{id}")
    public Optional<Animal> getAnimalById(@PathVariable String id) {
        return animalRepository.findById(id);
    }

    // Criar um novo animal
    @PostMapping
    public Animal createAnimal(@RequestBody Animal animal) {
        return animalRepository.save(animal);
    }

    // Atualizar um animal existente
    @PutMapping("/{id}")
    public Animal updateAnimal(@PathVariable String id, @RequestBody Animal updatedAnimal) {
        return animalRepository.findById(id).map(animal -> {
            animal.setNome(updatedAnimal.getNome());
            animal.setTipo(updatedAnimal.getTipo());
            animal.setGenero(updatedAnimal.getGenero());
            animal.setIdade(updatedAnimal.getIdade());
            animal.setPorte(updatedAnimal.getPorte());
            animal.setRaca(updatedAnimal.getRaca());
            animal.setDisponibilidade(updatedAnimal.getDisponibilidade());
            animal.setIdOng(updatedAnimal.getIdOng());
            animal.setFoto(updatedAnimal.getFoto());
            animal.setDescricao(updatedAnimal.getDescricao());
            return animalRepository.save(animal);
        }).orElseGet(() -> {
            updatedAnimal.setId(id);
            return animalRepository.save(updatedAnimal);
        });
    }

    // Deletar um animal
    @DeleteMapping("/{id}")
    public void deleteAnimal(@PathVariable String id) {
        animalRepository.deleteById(id);
    }
}
