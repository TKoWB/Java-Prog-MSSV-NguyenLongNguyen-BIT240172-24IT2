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
public class Printer {

    // Method generic độc lập với class
    public static <E> void print(E element) {
        System.out.println(element);
    }
}