package game.entity;

import game.Position;

/**
 * Created by paymonsattarzadeh on 10/01/2015.
 */
public abstract class Entity {

    protected Position position;

    /**
     * Entities momentum.
     */
    protected double momentum;

    /**
     * Flag representing if the entity is able to move.
     */
    protected boolean canMove;

    /**
     * The entities velocity, it is constant for all entities.
     */
    public static final double velocity = 2.0D;

    /**
     * Create the entity.
     */
    public abstract void render();

    /**
     * Moves the entity.
     *
     * @param position
     *      position entity is to be moved to.
     */
    public abstract void move(Position position);

    public final Position getPosition(){
        return position;
    }
}

