/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chuong2ex3_abstract_factory;
import com.mycompany.chuong2ex3_abstract_factory.factory.DarkThemeFactory;
import com.mycompany.chuong2ex3_abstract_factory.factory.LightThemeFactory;
import com.mycompany.chuong2ex3_abstract_factory.factory.UIFactory;
import com.mycompany.chuong2ex3_abstract_factory.ui.button.Button;
import com.mycompany.chuong2ex3_abstract_factory.ui.checkbox.Checkbox;
/**
 *
 * @author Admin
 */
public class Chuong2Ex3_abstract_factory {
    public static void main(String[] args) {

        // Chọn theme Light
        UIFactory lightFactory = new LightThemeFactory();
        Button lightBtn = lightFactory.createButton();
        Checkbox lightCheckbox = lightFactory.createCheckbox();

        lightBtn.render();
        lightCheckbox.render();

        // Chọn theme Dark
        UIFactory darkFactory = new DarkThemeFactory();
        Button darkBtn = darkFactory.createButton();
        Checkbox darkCheckbox = darkFactory.createCheckbox();

        darkBtn.render();
        darkCheckbox.render();
    }
}