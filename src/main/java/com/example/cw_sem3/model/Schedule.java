package com.example.cw_sem3.model;

public class Schedule {
    private int id;
    private String roomNumber;
    private String time;
    private String dayOfWeek;
    private String teacher;
    private String groupName;

    // Конструкторы, геттеры и сеттеры
    public Schedule() {}

    public Schedule(int id, String roomNumber, String time, String dayOfWeek, String teacher, String groupName) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.time = time;
        this.dayOfWeek = dayOfWeek;
        this.teacher = teacher;
        this.groupName = groupName;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getRoomNumber() { return roomNumber; }
    public void setRoomNumber(String roomNumber) { this.roomNumber = roomNumber; }

    public String getTime() { return time; }
    public void setTime(String time) { this.time = time; }

    public String getDayOfWeek() { return dayOfWeek; }
    public void setDayOfWeek(String dayOfWeek) { this.dayOfWeek = dayOfWeek; }

    public String getTeacher() { return teacher; }
    public void setTeacher(String teacher) { this.teacher = teacher; }

    public String getGroupName() { return groupName; }
    public void setGroupName(String groupName) { this.groupName = groupName; }
}

