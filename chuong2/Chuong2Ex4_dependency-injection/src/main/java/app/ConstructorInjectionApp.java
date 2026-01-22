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
public class ConstructorInjectionApp {

    private final MessageService messageService;

    // Inject dependency qua constructor
    public ConstructorInjectionApp(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser(String message) {
        messageService.sendMessage(message);
    }
}