package view;


import controller.Controller;
import controller.EventListener;
import model.GameObjects;

import javax.swing.*;

/**
 * View class
 * 04.08.2016
 * Created by TheZalesskie
 */

public class View extends JFrame {
    private Controller controller;
    private Field field;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void init() {
        field = new Field(this);
        add(field);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setTitle("Сокобан");
        setVisible(true);
    }

    public void setEventListener(EventListener eventListener) {
        this.field.setEventListener(eventListener);
    }

    public void update() {
        this.field.repaint();
    }

    public GameObjects getGameObjects() {
        return controller.getGameObjects();
    }

    public void completed(int level) {
        update();
        JOptionPane.showMessageDialog(null, level + "Completed", "Level", JOptionPane.INFORMATION_MESSAGE);
        controller.startNextLevel();
    }


}
