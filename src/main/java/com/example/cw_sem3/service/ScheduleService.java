package com.example.cw_sem3.service;

import com.example.cw_sem3.model.Schedule;
import com.example.cw_sem3.repository.ScheduleRepository;

import java.util.List;

public class ScheduleService {
    private final ScheduleRepository repository = new ScheduleRepository();

    public List<Schedule> getAllSchedules() {
        return repository.findAll();
    }

    public Schedule getScheduleById(int id) {
        return repository.findById(id);
    }
}
