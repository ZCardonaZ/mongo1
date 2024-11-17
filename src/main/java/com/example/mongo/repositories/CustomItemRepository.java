package com.example.mongo.repositories;

public interface CustomItemRepository {
    void updateItemQuantity(String name, float newQuantity);
}
