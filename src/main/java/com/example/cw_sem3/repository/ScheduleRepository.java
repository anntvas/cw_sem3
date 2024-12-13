package com.example.cw_sem3.repository;

import com.example.cw_sem3.model.Schedule;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ScheduleRepository {
    private final String jdbcUrl = "jdbc:postgresql://localhost:5432/schedule_db";
    private final String jdbcUser = "postgres";
    private final String jdbcPassword = "password";

    public List<Schedule> findAll() {
        List<Schedule> schedules = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword)) {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM schedule");
            while (rs.next()) {
                schedules.add(new Schedule(
                        rs.getInt("id"),
                        rs.getString("room_number"),
                        rs.getString("time"),
                        rs.getString("day_of_week"),
                        rs.getString("teacher"),
                        rs.getString("group_name")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return schedules;
    }

    public Schedule findById(int id) {
        try (Connection connection = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword)) {
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM schedule WHERE id = ?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Schedule(
                        rs.getInt("id"),
                        rs.getString("room_number"),
                        rs.getString("time"),
                        rs.getString("day_of_week"),
                        rs.getString("teacher"),
                        rs.getString("group_name")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
