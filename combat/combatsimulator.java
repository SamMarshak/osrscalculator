import java.util.Random;
import java.util.Date;

import classes.Enemy;
import classes.Player;



public class combatsimulator {

    private Date date = new Date();
    private long seed = date.getTime();
    protected Random randomgen = new Random(seed);

    Player p = new Player();
    Enemy foe = new Enemy();

    public static void main(String[] args) {
        
        p.
    }


    private boolean compare(int attackroll, int defenseroll)
    {
        return attackroll >= defenseroll;
    }

    private int calculateAttackRoll() //todo
    {
        return 0;
    }

    private int calculateStrengthRoll() //todo
    {
        return 0;
    }

    private int calculateEnemyDefenseRoll()
    {
        return 0; 
    }
}
