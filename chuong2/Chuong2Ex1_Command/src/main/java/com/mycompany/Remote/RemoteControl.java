/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Remote;

/**
 *
 * @author Admin
 */

import com.mycompany.command.Command;

public class RemoteControl {

    private Command command;

    // Gán hành động tương ứng với nút bấm
    public void setCommand(Command command) {
        this.command = command;
    }

    // Nhấn nút
    public void pressButton() {
        if (command != null) {
            command.execute();
        }
    }
}