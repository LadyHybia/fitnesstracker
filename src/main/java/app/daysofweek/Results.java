package app.daysofweek;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Results {
    private Long id;
    private String day_of_week;


    public Results(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getDay_of_week() {
        return day_of_week;
    }

    public void setDay_of_week(String day_of_week) {
        this.day_of_week = day_of_week;
    }

    @Override
    public String toString(){
        return "results["+ '\''+
                '{'+ '\''+
                "id=" + id + '\''+
                "day_of_week='" + day_of_week + '\''+
                '}'+ '\''+
                ']';

    }
}
