package game.perks;

import game.Position;
import game.entity.player.Player;
import game.perks.impl.Freeze;

/**
 * Created by paymonsattarzadeh on 11/01/2015.
 */
public enum PerkConstants {

    FREEZE(new Freeze(5, 1, true, new Player(new Position(2, 3)), new Player(new Position(2, 3))));/**
    BOTTLES(new Freeze(5, 1, true, player1, player2)),//Example
    GOAL_EXPAND(new Freeze(5, 1, true, player1, player2)),//Example
    GOAL_CONTRACT(new Freeze(5, 1, true, player1, player2)),//Example
    EXTRA_BALL(new Freeze(5, 1, true, player1, player2)),//Example
    DOUBLE_SPEED(new Freeze(5, 1, true, player1, player2)),//Example
    PLAYER_EXPAND(new Freeze(5, 1, true, player1, player2)),//Example
    PLAYER_CONTRACT(new Freeze(5, 1, true, player1, player2)),//Example
    DOUBLE_JUMP(new Freeze(5, 1, true, player1, player2));//Example*/


    //public Player player1;//temp
    //public Player player2;//temp

    private Perk perk;

    PerkConstants(final Perk perk) {
        this.perk = perk;
    }

    public Perk getPerk() {
        return perk;
    }

}
