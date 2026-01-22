/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chuong2ex4_dependency.injection;
import app.*;
import service.*;
/**
 *
 * @author Admin
 */
public class Chuong2Ex4_dependencyInjection {
    public static void main(String[] args) {

        MessageService emailService = new EmailService();
        MessageService smsService = new SmsService();

        // Constructor Injection
        ConstructorInjectionApp app1 =
                new ConstructorInjectionApp(emailService);
        app1.notifyUser("Hello via Constructor Injection");

        // Setter Injection
        SetterInjectionApp app2 = new SetterInjectionApp();
        app2.setMessageService(smsService);
        app2.notifyUser("Hello via Setter Injection");

        // Field Injection
        FieldInjectionApp app3 = new FieldInjectionApp();
        app3.messageService = emailService; // Inject thủ công
        app3.notifyUser("Hello via Field Injection");
    }
}