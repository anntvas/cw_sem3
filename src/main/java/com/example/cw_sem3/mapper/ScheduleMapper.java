package mapper;


import model.Schedule;

import java.sql.ResultSet;


public class ScheduleMapper {
    public Schedule mapRow(ResultSet resultSet) {
        try {
            Schedule schedule = new Schedule();
            schedule.setId(resultSet.getLong("id"));
            schedule.setRoom(resultSet.getString("room_number"));
            schedule.setTime(resultSet.getString("time"));
            schedule.setWeekday(resultSet.getString("day_of_week"));
            schedule.setTeacher(resultSet.getString("teacher"));
            schedule.setGroupNumber(resultSet.getString("group_name"));
            return schedule;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
