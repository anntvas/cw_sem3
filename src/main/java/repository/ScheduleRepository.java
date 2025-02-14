package repository;

import mapper.ScheduleMapper;
import model.Schedule;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ScheduleRepository {

    private ScheduleMapper scheduleMapper = new ScheduleMapper();

    public List<Schedule> getAll(Connection conn) {
        try(PreparedStatement ps = conn.prepareStatement("SELECT * FROM schedule")) {
            ResultSet rs = ps.executeQuery();
            List<Schedule> schedules = new ArrayList<>();
            while(rs.next()){
                schedules.add(scheduleMapper.mapRow(rs));
            }
            return schedules;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Schedule getById(long id, Connection conn) {
        try(PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM schedule WHERE schedule_id = ?")) {
            preparedStatement.setLong(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            if(rs.next()) {
                return scheduleMapper.mapRow(rs);
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }
}
