package classes;

import java.util.Map;
import java.util.HashMap;

import enums.AttackType;
import enums.CombatType;

public class Enemy {
    protected int hp;
    protected int defense;
    protected int stabdef;
    protected int slashdef;
    protected int crushdef;
    protected int lightrdef;
    protected int medrdef;
    protected int heavyrdef;
    protected int magedef;

    Map<AttackType, Integer> defensemap = new HashMap<>();

    public Enemy()
    {
        this.hp = 0;
        this.defense = 0;
        setMeleeDefense(this, 0, 0, 0);
        setOtherDefense(this, 0, 0, 0, 0);
    }
    public Enemy(int hp, int defense, int stabdef, int slashdef, int crushdef, int lightrdef, int medrdef, int heavyrdef, int magedef)
    {
        this.hp = hp;
        this.defense = defense;
        setMeleeDefense(this, stabdef, slashdef, crushdef);
        setOtherDefense(this, lightrdef, medrdef, heavyrdef, magedef);
    }

    private void setMeleeDefense(Enemy e, int stab, int slash, int crush)
    {
        e.stabdef = stab;
        e.slashdef = slash;
        e.crushdef = crush;
    }

    private void setOtherDefense(Enemy e, int light, int med, int heavy, int mage)
    {
        e.lightrdef = light;
        e.medrdef = med;
        e.heavyrdef = heavy;
        e.magedef = mage;
    }


    public int getDefenseRoll(CombatType c)
    {
        //geteffectivelevel

        double effectivelevel = Math.floor(defense + 8);
        //get defenseroll
        int defenseroll = (int) effectivelevel * (defensemap.get(c) * 64);
        
        return defenseroll;
    }

    protected void initializemap()
    {
        defensemap.put(AttackType.STAB, stabdef);
        defensemap.put(AttackType.SLASH, slashdef);
        defensemap.put(AttackType.CRUSH, crushdef);
        defensemap.put(AttackType.MAGE, magedef);
        defensemap.put(AttackType.LIGHT, lightrdef);
        defensemap.put(AttackType.MEDIUM, medrdef);
        defensemap.put(AttackType.HEAVY, heavyrdef);
    }

}
