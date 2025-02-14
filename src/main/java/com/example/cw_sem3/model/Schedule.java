package model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Schedule {
    private long id;
    private String room;
    private String time;
    private String weekday;
    private String teacher;
    private String groupNumber;

    public Schedule() {
    }
}
