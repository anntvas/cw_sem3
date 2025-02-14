CREATE TABLE schedule (
    schedule_id SERIAL PRIMARY KEY,
    room VARCHAR(255) NOT NULL,
    time VARCHAR(255) NOT NULL,
    weekday VARCHAR(255) NOT NULL,
    teacher VARCHAR(255) NOT NULL,
    group_number VARCHAR(255) NOT NULL
);