package model;


import java.util.HashSet;
import java.util.Set;

/**
 * GameObjects class
 * 04.08.2016
 * Created by TheZalesskie
 */
public class GameObjects {
    Set<Wall> walls;
    Set<Box> boxes;
    Set<Home> homes;
    private Player player;

    public Set<GameObject> getAll() {

        Set<GameObject> all = new HashSet<GameObject>();
        all.addAll(getWalls());
        all.addAll(getBoxes());
        all.addAll(getHomes());
        all.add(getPlayer());

        return all;
    }



    public Set<Wall> getWalls() {
        return walls;
    }

    public Set<Box> getBoxes() {
        return boxes;
    }

    public Set<Home> getHomes() {
        return homes;
    }

    public Player getPlayer() {
        return player;
    }

    public GameObjects(Set<Wall> walls, Set<Box> boxes, Set<Home> homes, Player player) {
        this.walls = walls;
        this.boxes = boxes;
        this.homes = homes;
        this.player = player;
    }


}



