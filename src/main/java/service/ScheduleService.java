package service;

import db.DataBaseConfig;
import model.Schedule;
import repository.ScheduleRepository;

import java.sql.Connection;
import java.util.List;

public class ScheduleService {
    private final ScheduleRepository repository = new ScheduleRepository();
    private final DataBaseConfig dataBaseConfig;

    public ScheduleService(DataBaseConfig dataBaseConfig) {
        this.dataBaseConfig = dataBaseConfig;
    }

    public List<Schedule> getAllSchedule() {
        try (Connection connection = dataBaseConfig.getConnection()) {
            return repository.getAll(connection);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Schedule getSchedule(long id) {
        try(Connection connection = dataBaseConfig.getConnection()) {
            return repository.getById(id, connection);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}