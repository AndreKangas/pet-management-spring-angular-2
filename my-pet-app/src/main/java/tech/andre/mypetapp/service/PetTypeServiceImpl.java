package tech.andre.mypetapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.andre.mypetapp.entity.Pet;
import tech.andre.mypetapp.entity.PetType;
import tech.andre.mypetapp.repository.PetTypeRepository;

@Service
public class PetTypeServiceImpl implements PetTypeService  {

	@Autowired
    private PetTypeRepository petTypeRepository;

    @Override
    public List<PetType> findAll() {
        return petTypeRepository.findAll();
    }

    @Override
    public Optional<PetType> findById(Integer id) {
        return petTypeRepository.findById(id);
    }

    @Override
    public PetType save(PetType petType) {
        return petTypeRepository.save(petType);
    }
	
}
