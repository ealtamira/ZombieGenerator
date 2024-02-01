package org.example.controller;

import org.example.util.Die;
import org.example.view.MyMenu;

public class MyController {
    private MyMenu menu = new MyMenu();
    private ZedGenerator generator = new ZedGenerator();
    public void startHere(){
        int selection = -1;
        while(selection !=4){
            selection = menu.mainMenu();
            switch (selection){
                case 1:
                    generator.gen1Zed();
                    break;
                case 2:
                    generator.genSomeZed();
                    break;
                case 3:
                    genZombie();
                    break;
                case 4:
                    break;
            }
        }
    }

    public void genZombie(){
        int amount = menu.nZed();
        generator.genUserNumZed(amount);
    }
}
