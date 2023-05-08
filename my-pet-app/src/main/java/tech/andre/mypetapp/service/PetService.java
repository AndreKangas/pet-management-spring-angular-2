package tech.andre.mypetapp.service;

import tech.andre.mypetapp.dto.PetPostDTO;
import tech.andre.mypetapp.entity.Pet;
import java.util.List;
import java.util.Optional;

public interface PetService {
    List<Pet> findAll();
    Optional<Pet> findById(Long id);
    Pet save(PetPostDTO pet);
    void deleteById(Long id);
}