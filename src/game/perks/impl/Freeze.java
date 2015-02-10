package game.perks.impl;

import game.entity.player.Player;
import game.perks.Perk;

/**
 * Created by paymonsattarzadeh on 10/01/2015.
 */
public class Freeze extends Perk {

    public Freeze(int perkLength, int perkID, boolean active, Player player1, Player player2) {
        this.perkLength = perkLength;
        this.perkID = perkID;
        this.active = active;
        this.player1 = player1;
        this.player2 = player2;
    }

    @Override
    public void initialise() {

    }

}
