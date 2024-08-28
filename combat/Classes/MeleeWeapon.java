package Classes;
import enums.CombatType;

public class MeleeWeapon extends Weapon {

    protected int stabacc;
    protected int slashacc;
    protected int crushacc;
    protected int strbonus;
   

    public MeleeWeapon(int speed, int stab, int slash, int crush, int str )
    {
        super(speed, CombatType.MELEE);
        slashacc = slash;
        crushacc = crush;
        strbonus = str;
    }
//todo: implement more parts of the weapon
   
}
