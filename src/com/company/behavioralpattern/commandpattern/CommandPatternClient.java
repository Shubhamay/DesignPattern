package com.company.behavioralpattern.commandpattern;

public class CommandPatternClient {
    public static void main(String[] args) {
        Document doc = new Document();

        ActionListenerCommand clickOpen = new ActionOpen(doc);
        ActionListenerCommand clickSave = new ActionSave(doc);

        MenuOptions menu = new MenuOptions(clickOpen, clickSave);

        menu.clickOpen();
        menu.clickSave();

        //Using a functional interface
        ActionListenerCommand switchOn = doc::open;
        ActionListenerCommand switchOff = doc::save;

        MenuOptions menu1 = new MenuOptions(switchOn, switchOff);
        menu1.clickOpen();
        menu1.clickOpen();
    }
}
