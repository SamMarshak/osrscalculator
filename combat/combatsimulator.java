import java.util.Random;
import java.util.Date;
import java.math.*;
public class combatsimulator {

    private Date date = new Date();
    private long seed = date.getTime();
    protected Random randomgen = new Random(seed);



    public static void main(String[] args) {
        
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
}
