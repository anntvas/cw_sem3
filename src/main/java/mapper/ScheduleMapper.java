package mapper;


import model.Schedule;

import java.sql.ResultSet;


public class ScheduleMapper {
    public Schedule mapRow(ResultSet resultSet) {
        try {
            Schedule schedule = new Schedule();
            schedule.setId(resultSet.getLong("schedule_id"));
            schedule.setRoom(resultSet.getString("room"));
            schedule.setTime(resultSet.getString("time"));
            schedule.setWeekday(resultSet.getString("weekday"));
            schedule.setTeacher(resultSet.getString("teacher"));
            schedule.setGroupNumber(resultSet.getString("group_number"));
            return schedule;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
