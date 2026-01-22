/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Admin
 */
public class MemoryRepository<T> implements Repository<T> {

    private ArrayList<T> data = new ArrayList<>();

    @Override
    public void save(T item) {
        data.add(item);
    }

    @Override
    public T findById(int id) {
        if (id < data.size()) {
            return data.get(id);
        }
        return null;
    }
}