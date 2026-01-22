/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.chuong2ex3_abstract_factory.factory;

import com.mycompany.chuong2ex3_abstract_factory.ui.button.Button;
import com.mycompany.chuong2ex3_abstract_factory.ui.checkbox.Checkbox;

public interface UIFactory {
    Button createButton();
    Checkbox createCheckbox();
}