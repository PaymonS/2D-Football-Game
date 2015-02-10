package game.perks;

import game.entity.player.Player;

/**
 * Created by paymonsattarzadeh on 10/01/2015.
 */
public abstract class Perk {

    /**
     * Length(in seconds) the perk will last for.
     */
    protected int perkLength = -1;

    /**
     * The Unique identifier of the perk.
     */
    protected int perkID;

    /**
     * Flag representing if a perk is active. Active perks
     * cannot be spawned again while active.
     */
    protected boolean active;

    /**
     * The owner of the perk, this is the player that picked up the perk
     */
    protected Player player1;

    /**
     * The target player
     */
    protected Player player2;

    /**
     * Initialises the perk.
     */
    public abstract void initialise();

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

}
