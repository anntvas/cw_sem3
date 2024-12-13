CREATE TABLE schedule (
                          id SERIAL PRIMARY KEY,
                          room_number VARCHAR(10) NOT NULL,
                          time VARCHAR(50) NOT NULL,
                          day_of_week VARCHAR(20) NOT NULL,
                          teacher VARCHAR(100) NOT NULL,
                          group_name VARCHAR(100) NOT NULL
);
