/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chuong2ex2.mediator;
import mediator.ChatMediator;
import mediator.ChatMediatorImpl;
import user.User;
import user.UserImpl;

/**
 *
 * @author Admin
 */
public class Chuong2Ex2Mediator {
    public static void main(String[] args) {

        ChatMediator mediator = new ChatMediatorImpl();

        User user1 = new UserImpl(mediator, "Alice");
        User user2 = new UserImpl(mediator, "Bob");
        User user3 = new UserImpl(mediator, "Charlie");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.send("Hello mọi người!");
        user3.send("Chào Alice!");
    }
}