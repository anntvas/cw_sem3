package db;

import service.ScheduleService;

public class ServiceReturner {
    private DataBaseConfig config;

    public ServiceReturner() {
        config = new DataBaseConfig();
    }

    public void close() {
        config.close();
    }

    public ScheduleService getScheduleService() {
        return new ScheduleService(config);
    }
}
