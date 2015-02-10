package game.entity.ball;

import game.Path;
import game.Position;
import game.entity.Entity;

/**
 * Created by paymonsattarzadeh on 09/01/2015.
 */
public class Ball extends Entity {

    @Override
    public void render() {

    }

    @Override
    public void move(Position position) {

    }

    public void rotate() {

    }

    public void travel(Path path) {
        Path path1 = new Path(new Position(1, 2), new Position(2,3), new Ball());
    }

}
