package tech.andre.mypetapp.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "pet_types")
public class PetType implements Serializable {

	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    private String name;
	    
	    public PetType() {
	    }
	    
	    public PetType(String name, int id) {
	    	this.id = id;
	        this.name = name;
	    }
	    
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }
}
