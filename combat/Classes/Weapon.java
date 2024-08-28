package Classes;
import enums.CombatType;
public class Weapon {
    protected int attackspeed;
    protected CombatType type;
    
    public Weapon(int speed, CombatType cbtype)
    {
        attackspeed = speed;
        type = cbtype;
    }
}
