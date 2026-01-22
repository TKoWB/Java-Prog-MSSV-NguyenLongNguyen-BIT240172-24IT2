/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



package com.mycompany.test;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {

        // Generic Class + Interface
        MemoryRepository<String> stringRepo = new MemoryRepository<>();
        stringRepo.save("Java");
        stringRepo.save("Generics");

        String value = stringRepo.findById(0);
        System.out.println(value);

        // Generic Method
        Printer.print(100);
        Printer.print("Hello");
        Printer.print(3.14);
    }
}
