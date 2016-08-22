package model;

import java.awt.*;

/**
 * Player class
 * 04.08.2016
 * Created by TheZalesskie
 */
public class Player extends CollisionObject implements Movable {


    public Player(int x, int y) {
        super(x, y);

    }

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color.YELLOW);

        int leftUpperCornerX = getX() - getWidth() / 2;
        int leftUpperCornerY = getY() - getHeight() / 2;

        graphics.drawOval(leftUpperCornerX, leftUpperCornerY, getWidth(), getHeight());
        graphics.fillOval(leftUpperCornerX, leftUpperCornerY, getWidth(), getHeight());

    }
    //должен смещать координаты объектов (x и y) на переданные значения
    @Override
    public void move(int x, int y) {
        this.setX(this.getX() + x);
        this.setY(this.getY() + y);

    }
}
