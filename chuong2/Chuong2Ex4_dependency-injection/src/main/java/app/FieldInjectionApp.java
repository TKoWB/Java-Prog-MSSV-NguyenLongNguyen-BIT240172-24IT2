/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;
import service.MessageService;
/**
 *
 * @author Admin
 */
public class FieldInjectionApp {

    // Inject trực tiếp vào field
    public MessageService messageService;

    public void notifyUser(String message) {
        messageService.sendMessage(message);
    }
}