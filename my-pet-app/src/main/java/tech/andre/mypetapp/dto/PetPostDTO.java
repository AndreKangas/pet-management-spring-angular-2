package tech.andre.mypetapp.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import tech.andre.mypetapp.entity.PetType;
import tech.andre.mypetapp.entity.User;

public class PetPostDTO {

    private String name;
    private String identificationCode;
    private int type;
    private String furColor;



    public PetPostDTO(String name, String identificationCode, int type, String furColor, User user) {
        this.name = name;
        this.identificationCode = identificationCode;
        this.type = type;
        this.furColor = furColor;
    }



	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getIdentificationCode() {
	        return identificationCode;
	    }

	    public void setIdentificationCode(String identificationCode) {
	        this.identificationCode = identificationCode;
	    }

	    public int getType() {
	        return type;
	    }

	    public void setType(int type) {
	        this.type = type;
	    }

	    public String getFurColor() {
	        return furColor;
	    }

	    public void setFurColor(String furColor) {
	        this.furColor = furColor;
	    }
}
