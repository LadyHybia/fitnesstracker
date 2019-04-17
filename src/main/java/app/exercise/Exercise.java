package app.exercise;

import app.daysofweek.Results;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Exercise {

    private Long count;
    private String next;
    private String previous;
    private List<Results> results;

    public Exercise() {

    }

    public Long getCount() {
        return count;
    }

    public void setCount() {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext() {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious() {
        this.previous = previous;
    }

    public List getResults() {
        return results;
    }

    public void setResults(List results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return '\n' + "count{" + '\n' +
                "count=" + count + '\n' +
                ", next='" + next + '\n' +
                ", previous='" + previous + '\n' +
                "results=" + results + '\n' +
                '}' + '\n';
    }
}