package game;

import game.entity.Entity;

/**
 * Created by paymonsattarzadeh on 10/01/2015.
 */
public class Path {

    private Position startPosition;

    private Position targetPosition;

    private Entity entity;

    public Path(Position startPosition, Position targetPosition, Entity entity) {
        this.startPosition = startPosition;
        this.targetPosition = targetPosition;
        this.entity = entity;
    }

    public void findPath() {

    }

    private void moveEntity() {
        entity.getPosition();
    }
}
