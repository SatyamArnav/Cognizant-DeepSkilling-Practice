package com.example;

public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }

    public void saveData(String data) {
        api.save(data);
    }

    public String getStatus() {
        return api.getStatus();
    }

    public String fetchById(int id) {
        return api.fetchById(id);
    }
}
