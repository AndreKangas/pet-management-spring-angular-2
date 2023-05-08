package tech.andre.mypetapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "pet")
public class Pet implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String identificationCode;
    // petType
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "type_id", nullable = false)
    private PetType type;
    private String furColor;

    public Pet() {
    }
    

    public Pet(String name, String identificationCode, PetType type, String furColor) {
        this.name = name;
        this.identificationCode = identificationCode;
        this.type = type;
        this.furColor = furColor;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public PetType getType() {
        return type;
    }

    public void setType(PetType type) {
        this.type = type;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

}