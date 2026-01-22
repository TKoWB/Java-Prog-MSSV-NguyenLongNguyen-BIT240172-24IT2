/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chuong2ex1_command;

import com.mycompany.Devices.Fan;
import com.mycompany.Devices.Light;
import com.mycompany.Remote.RemoteControl;
import com.mycompany.command.Command;
import com.mycompany.command.FanOffCommand;
import com.mycompany.command.FanOnCommand;
import com.mycompany.command.LightOffCommand;
import com.mycompany.command.LightOnCommand;

/**
 *
 * @author Admin
 */



public class Chuong2Ex1_Command {
    public static void main(String[] args) {

        RemoteControl remote = new RemoteControl();

        Light light = new Light();
        Fan fan = new Fan();

        // Commands
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        Command fanOn = new FanOnCommand(fan);
        Command fanOff = new FanOffCommand(fan);

        System.out.println("== Điều khiển đèn ==");
        remote.setCommand(lightOn);
        remote.pressButton();

        remote.setCommand(lightOff);
        remote.pressButton();

        System.out.println("\n== Điều khiển quạt ==");
        remote.setCommand(fanOn);
        remote.pressButton();

        remote.setCommand(fanOff);
        remote.pressButton();
    }
}