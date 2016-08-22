package controller;


import model.Direction;

/**
 * EventListener class
 * 04.08.2016
 * Created by TheZalesskie
 */
public interface EventListener {
    void move(Direction direction); // move an object in a certain direction.
    void restart();                 // start again the current level.
    void startNextLevel();          // start the next level.
    void levelCompleted(int level); // level with the finished level number.
}
