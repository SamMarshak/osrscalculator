package classes;

import enums.EquipmentSlot;
public abstract class Armor {

    protected int stab;
    protected int slash;
    protected int crush;
    protected int range;
    protected int mage;
    protected double meleestr;
    protected double rangestr;
    protected double magestr;
    protected int stabdef;
    protected int slashdef;
    protected int crushdef;
    protected int rangedef;
    protected int magedef;
    protected EquipmentSlot slot;

    public Armor()
    {
        slot = null;
        setAccuracy(this, 0, 0, 0, 0, 0);
        setDefenses(this, 0, 0, 0, 0, 0);
        setStrBonus(this, 0, 0, 0);
    }

    public Armor(EquipmentSlot slot, int stab,int slash, int crush, int range, int mage, int meleestr, int rangestr, int magestr, int stabdef, int slashdef, int crushdef, int rangedef, int magedef)
    {
        this.slot = slot;
        setAccuracy(this, stabdef, slashdef, crushdef, rangedef, magedef);
        setDefenses(this, stabdef, slashdef, crushdef, rangedef, magedef);
        setStrBonus(this, meleestr, rangestr, magestr);
    }

    protected void setAccuracy(Armor a, int stab, int slash, int crush, int range, int mage)
    {
        a.stab = stab;
        a.slash = slash;
        a.crush = crush;
        a.range = range;
        a.mage = mage;
    }

    protected void setStrBonus(Armor a, double meleestr, double rangestr, double magestr)
    {
        a.meleestr = meleestr;
        a.rangestr = rangestr;
        a.magestr = magestr;
    }

    protected void setDefenses(Armor a, int stabdef, int slashdef, int crushdef, int rangedef, int magedef)
    {
        a.stabdef = stabdef;
        a.slashdef = slashdef;
        a.crushdef = crushdef;
        a.rangedef = rangedef;
        a.magedef = magedef;    
    }

    
}
