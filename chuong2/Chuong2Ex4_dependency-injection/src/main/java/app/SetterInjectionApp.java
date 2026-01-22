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
public class SetterInjectionApp {

    private MessageService messageService;

    // Inject dependency qua setter
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser(String message) {
        if (messageService == null) {
            throw new IllegalStateException("MessageService is not set");
        }
        messageService.sendMessage(message);
    }
}