package tech.andre.mypetapp.service;

import java.util.List;
import java.util.Optional;
import tech.andre.mypetapp.entity.PetType;

public interface PetTypeService {
	List<PetType> findAll();
    Optional<PetType> findById(Integer id);
    PetType save(PetType petType);
}
