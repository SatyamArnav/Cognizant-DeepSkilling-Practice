package com.example;

public interface ExternalApi {
    String getData();
    void save(String data);
    String getStatus();
    String fetchById(int id);
}
