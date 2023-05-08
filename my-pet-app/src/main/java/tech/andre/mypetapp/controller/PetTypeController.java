package tech.andre.mypetapp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.andre.mypetapp.entity.Pet;
import tech.andre.mypetapp.entity.PetType;
import tech.andre.mypetapp.service.PetService;
import tech.andre.mypetapp.service.PetTypeService;


@RestController
@RequestMapping("/api/pettypes")
public class PetTypeController {
//	@GetMapping
//    public ResponseEntity<List<PetType>> findAll() {
//		
//		List<PetType> list = new ArrayList<PetType>();
//		list.add(new PetType("CAT", 1));
//        return ResponseEntity.ok(list);
//	}
	
	 @Autowired
	    private PetTypeService petTypeService;

	    @GetMapping
	    public ResponseEntity<List<PetType>> findAll() {
	        return ResponseEntity.ok(petTypeService.findAll());
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<PetType> findById(@PathVariable Integer id) {
	        Optional<PetType> petType = petTypeService.findById(id);
	        if (petType.isPresent()) {
	            return ResponseEntity.ok(petType.get());
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }
	    
	    @PostMapping
	    public ResponseEntity<PetType> save(@RequestBody PetType petType) {
	        return ResponseEntity.status(HttpStatus.CREATED).body(petTypeService.save(petType));
	    }
	
}
	
	
