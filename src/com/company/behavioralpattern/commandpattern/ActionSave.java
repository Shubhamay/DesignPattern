package com.company.behavioralpattern.commandpattern;

public class ActionSave implements ActionListenerCommand{
    private Document doc;
    public ActionSave(Document doc) {
        this.doc = doc;
    }
    @Override
    public void execute() {
        doc.save();
    }
}
