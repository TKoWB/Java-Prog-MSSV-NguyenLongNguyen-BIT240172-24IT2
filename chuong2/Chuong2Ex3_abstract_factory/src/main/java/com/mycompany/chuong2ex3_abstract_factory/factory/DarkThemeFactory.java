/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chuong2ex3_abstract_factory.factory;

import com.mycompany.chuong2ex3_abstract_factory.ui.button.Button;
import com.mycompany.chuong2ex3_abstract_factory.ui.button.DarkButton;
import com.mycompany.chuong2ex3_abstract_factory.ui.checkbox.Checkbox;
import com.mycompany.chuong2ex3_abstract_factory.ui.checkbox.DarkCheckbox;

public class DarkThemeFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
}