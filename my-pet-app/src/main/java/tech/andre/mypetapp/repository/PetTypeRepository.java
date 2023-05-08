package tech.andre.mypetapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.andre.mypetapp.entity.PetType;

public interface PetTypeRepository extends JpaRepository<PetType, Integer>{

	
}
