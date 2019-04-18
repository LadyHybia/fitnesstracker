package app.workout;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Results {
    private String comment;
    private Long id;
    private String creation_date;


    public Results() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(String creation_date) {
        this.creation_date = creation_date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "results["+ '\n'+
                '{'+ '\n'+
                "id=" + id + '\n'+
                "creation_date=" +  creation_date + '\n'+
                "comment=" + comment + '\n';
    }
}
