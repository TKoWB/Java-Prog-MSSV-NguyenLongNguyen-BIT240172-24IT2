/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mediator;

import user.User;

public interface ChatMediator {
    void sendMessage(String msg, User user);
    void addUser(User user);
}