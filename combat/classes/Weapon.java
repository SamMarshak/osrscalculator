package classes;
import enums.CombatType;
import enums.EquipmentSlot;

public abstract class Weapon {
    protected EquipmentSlot slot = EquipmentSlot.WEAPON;
    protected int attackspeed;
    protected CombatType type;
    protected boolean twohand; //true = 2h, false = 1h(can use offhand)

    public Weapon()
    {
        attackspeed = 1;
        type = null;
        twohand = false;
    }
    public Weapon(int speed, CombatType cbtype, boolean twohand)
    {
        attackspeed = speed;
        type = cbtype;
        this.twohand = twohand;
    }
}
