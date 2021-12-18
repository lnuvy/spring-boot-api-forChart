package yjteamproject.chartjs.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class CoronaDto {

    private String start;
    private String end;

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
}
