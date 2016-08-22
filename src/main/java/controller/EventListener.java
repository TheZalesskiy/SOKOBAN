package controller;


import model.Direction;

/**
 * EventListener class
 * 04.08.2016
 * Created by TheZalesskie
 */
public interface EventListener {
    void move(Direction direction); // передвинуть объект в определенном направлении.
    void restart();                 // начать заново текущий уровень.
    void startNextLevel();          // начать следующий уровень.
    void levelCompleted(int level); // уровень с номером level завершён.
}
