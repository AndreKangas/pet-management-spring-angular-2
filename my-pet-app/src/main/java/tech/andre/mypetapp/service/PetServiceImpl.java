package tech.andre.mypetapp.service;

import tech.andre.mypetapp.dto.PetPostDTO;
import tech.andre.mypetapp.entity.Pet;
import tech.andre.mypetapp.entity.PetType;
import tech.andre.mypetapp.repository.PetRepository;
import tech.andre.mypetapp.repository.PetTypeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetServiceImpl implements PetService {

    @Autowired
    private PetRepository petRepository;
    
    @Autowired
    private PetTypeRepository petTypeRepository;


    @Override
    public List<Pet> findAll() {
        return petRepository.findAll();
    }

    @Override
    public Optional<Pet> findById(Long id) {
        return petRepository.findById(id);
    }

    @Override
    public Pet save(PetPostDTO pet) {
    	PetType petType = petTypeRepository.findById(pet.getType()).get();
    	Pet petEntity = new Pet(pet.getName(), pet.getIdentificationCode(), petType, pet.getFurColor());
    	
        return petRepository.save(petEntity);
    }

    @Override
    public void deleteById(Long id) {
        petRepository.deleteById(id);
    }
    
}