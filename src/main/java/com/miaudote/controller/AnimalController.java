package com.miaudote.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.miaudote.model.Animal;
import com.miaudote.repository.AnimalRepository;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/animais")
public class AnimalController {

    @Autowired
    private AnimalRepository animalRepository;

    @PostMapping
    public Animal createAnimal(@RequestBody Animal animal) {
        return animalRepository.save(animal);
    }

    @GetMapping
    public List<Animal> getAllAnimais() {
        return animalRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Animal> getAnimalById(@PathVariable String id) {
        Optional<Animal> animalOptional = animalRepository.findById(id);
        return animalOptional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    


    @PutMapping("/{id}")
    public Animal updateAnimal(@PathVariable String id, @RequestBody Animal updatedAnimal) {
        updatedAnimal.setId(id);
        return animalRepository.save(updatedAnimal);
    }

    @DeleteMapping("/{id}")
    public void deleteAnimal(@PathVariable String id) {
        animalRepository.deleteById(id);
    }
}
