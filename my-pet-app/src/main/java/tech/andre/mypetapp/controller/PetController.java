package tech.andre.mypetapp.controller;

import tech.andre.mypetapp.dto.PetPostDTO;
import tech.andre.mypetapp.entity.Pet;
import tech.andre.mypetapp.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pets")
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping
    public ResponseEntity<List<Pet>> findAll() {
        return ResponseEntity.ok(petService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pet> findById(@PathVariable Long id) {
        Optional<Pet> pet = petService.findById(id);
        if (pet.isPresent()) {
            return ResponseEntity.ok(pet.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Pet> save(@RequestBody PetPostDTO pet) {
        return ResponseEntity.status(HttpStatus.CREATED).body(petService.save(pet));
//    	petService.save(pet);
//    	return ResponseEntity.ok(pet);
    }

    

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        petService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}