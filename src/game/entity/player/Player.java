package game.entity.player;

import game.Position;
import game.entity.Entity;

/**
 * Created by paymonsattarzadeh on 09/01/2015.
 */
public class Player extends Entity {

    private double mass = 50D;

    private String name;

    private String dateAccountCreated;

    private Skin skin;

    public Player(Position position) {
        this.position = position;
    }

    @Override
    public void render() {

    }

    @Override
    public void move(Position position) {

    }

    private void kick() {

    }

    private void jump() {

    }

}
