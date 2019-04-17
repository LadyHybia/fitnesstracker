package app.exercise;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Results {
    private Long id;
    private String license_author;
    private String status;
    private String description;
    private String name;
    private String name_original;
    private String creation_date;
    private String uuid;
    private Long licence;
    private Long category;
    private Long language;
    private List<Muscles> muscles;
    private List<Muscles_secondary> muscles_secondary;
    private List<Equipment> equipment;


    public Results() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLicense_author() {
        return license_author;
    }

    public void setLicense_author(String license_author) {
        this.license_author = license_author;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_original() {
        return name_original;
    }

    public void setName_original(String name_original) {
        this.name_original = name_original;
    }

    public String getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(String creation_date) {
        this.creation_date = creation_date;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Long getLicence() {
        return licence;
    }

    public void setLicence(Long licence) {
        this.licence = licence;
    }

    public Long getCategory() {
        return category;
    }

    public void setCategory(Long category) {
        this.category = category;
    }

    public Long getLanguage() {
        return language;
    }

    public void setLanguage(Long language) {
        this.language = language;
    }

    public List<Muscles> getMuscles() {
        return muscles;
    }

    public void setMuscles(List<Muscles> muscles) {
        this.muscles = muscles;
    }

    public List<Muscles_secondary> getMuscles_secondary() {
        return muscles_secondary;
    }

    public void setMuscles_secondary(List<Muscles_secondary> muscles_secondary) {
        this.muscles_secondary = muscles_secondary;
    }

    public List<Equipment> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<Equipment> equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return  "results[" +
                '{' +
                "id=" + id +
                ", license_author='" + license_author +
                ", status='" + status +
                ", description='" + description +
                ", name='" + name +
                ", name_original='" + name_original +
                ", creation_date='" + creation_date +
                ", uuid='" + uuid +
                ", licence='" + licence +
                ", category='" + category +
                ", language='" + language +
                ", muscles='" + muscles +
                ", muscles_secondary='" + muscles_secondary  +
                ", equipment='" + equipment +
                '}' +
                ']' ;

    }
}
