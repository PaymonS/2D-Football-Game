package game.perks;

        import game.Position;
        import game.entity.player.Player;
        import game.perks.impl.Freeze;

/**
 * Created by paymonsattarzadeh on 10/01/2015.
 */
public final class PerkManager {

    /**
     * The current active perk instance
     */
    public Perk activePerk;


    private void spawnPerk() {
        PerkConstants perk = PerkConstants.values()[getRandomPerk()];
    }

    private int getRandomPerk() {
        int index = (int) (Math.random() * PerkConstants.values().length - 1);
        return index;
    }

}
