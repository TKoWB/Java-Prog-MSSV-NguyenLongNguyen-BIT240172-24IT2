/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.test;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Admin
 */
public interface Repository<T> {
    void save(T item);
    T findById(int id);
}