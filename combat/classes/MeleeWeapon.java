package classes;
import enums.CombatType;

public class MeleeWeapon extends Weapon {

    protected int stabacc;
    protected int slashacc;
    protected int crushacc;
    protected int strbonus;
   

    public MeleeWeapon(int speed, int stab, int slash, int crush, int str, boolean twohand )
    {
        super(speed, CombatType.MELEE, twohand);
        slashacc = slash;
        crushacc = crush;
        strbonus = str;
    }
//todo: implement more parts of the weapon
    

}
