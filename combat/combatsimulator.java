import java.util.Random;
import java.util.Date;
import java.lang.Math;
import classes.Enemy;
import classes.Player;



public class combatsimulator {

    private static Date date;
    private static long seed;
    protected static Random randomgen;

    Player p = new Player();
    Enemy enemy = new Enemy();

    public static void main(String[] args) {
        date = new Date();
        seed = date.getTime();
        randomgen = new Random(seed);

        
    }


    private boolean compare(int attackroll, int defenseroll)
    {
        return attackroll >= defenseroll;
    }


    

}
