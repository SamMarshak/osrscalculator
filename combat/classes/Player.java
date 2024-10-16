package classes;

public class Player {
    //stats
    protected int attack;
    protected int strength;
    protected int defense;
    protected int range;
    protected int mage;
    protected int hitpoints;

    Armor[] list = new Armor[8];
    /*
     * 0=helm. 
     * 1=body
     * 2=legs
     * 3=boots
     * 4=cape
     * 5=ring
     * 6=ammo
     * 7=offhand
     */
    //gear
    protected Armor helm;
    protected Armor body;
    protected Armor legs;
    protected Armor boots;
    protected Armor cape;
    protected Armor ring;
    protected Armor ammo;
    protected Armor offhand;
    protected Weapon weapon;

    public Player()
    {
        attack = 99;
        strength = 99;
        defense = 99;
        range = 99;
        mage = 99;
        hitpoints = 99;
    }

    private int calculateAttackRoll() //todo
    {

        //get effective attack level
        double boosted_att = attack +(Math.floor(attack*0.15)+5); //TODO: add potions, assumign scb
        double prayerscale = 1.2; //assuming piety
        double other = 1; //salve/slay/sra/eetc
        double attstyle = 0; //TODO: add attack style
        double effectivelevel = (Math.floor((boosted_att * other * prayerscale + 8.0 + attstyle)));

        //get attack roll
        int attackRoll = (int) effectivelevel * (getSlashAttack()*64);

        return attackRoll;
    }

    private int calculateStrengthRoll() //todo
    {
        return 0;
    }

    public void setGear(Armor helm, Armor body, Armor legs, Armor boots, Armor cape, Armor ring, Armor ammo, Armor offhand)
    {
        this.helm = helm;
        list[0] = this.helm;
        this.body = body;
        list[1] = this.body;
        this.legs = legs;
        list[2] = this.legs;
        this.boots = boots;
        list[3] = this.boots;
        this.cape = cape;
        list[4] = this.cape;
        this.ring = ring;
        list[5] = this.ring;
        this.ammo = ammo;
        list[6] = this.ammo;
        this.offhand = offhand;
        list[7] = this.offhand;
    }

    public void setWeapon (Weapon weapon)
    {
        this.weapon = weapon;
    }
    public void setWeapon( Weapon weapon, Armor offhand)
    {
        this.weapon = weapon;
        this.offhand = offhand;
        list[7] = this.offhand;
    }
    //getters of gearbonuses
    public int getStabAttack()
    {
        int retval = 0;
        for(int i = 0; i <list.length; i++)
        {
            retval = list[i].stab;
        }
        return retval;
    }

    public int getSlashAttack()
    {
        int retval = 0;
        for(int i = 0; i <list.length; i++)
        {
            retval = list[i].slash;
        }
        return retval;
    }

    public int getCrushAttack()
    {
        int retval = 0;
        for(int i = 0; i <list.length; i++)
        {
            retval = list[i].crush;
        }
        return retval;
    }

    public int getRangeAttack()
    {
        int retval = 0;
        for(int i = 0; i <list.length; i++)
        {
            retval = list[i].range;
        }
        return retval;
    }

    public int getMageAttack()
    {
        int retval = 0;
        for(int i = 0; i <list.length; i++)
        {
            retval = list[i].mage;
        }
        return retval;
    }

    public int getStrBonus()
    {
        int retval = 0;
        for(int i = 0; i <list.length; i++)
        {
            retval = list[i].meleestr;
        }
        return retval;
    }

    public double getMageStrBonus()
    {
        double retval = 0;
        for(int i = 0; i <list.length; i++)
        {
            retval = list[i].magestr;
        }
        return retval;
    }

    public int getRangeStrBonus()
    {
        int retval = 0;
        for(int i = 0; i <list.length; i++)
        {
            retval = list[i].rangestr;
        }
        return retval;
    }

    //setters and getters of stats
    public void setDefense(int defense)
    {
        this.defense = defense;
    }
    public void setAttack(int attack)
    {
        this.attack = attack;
    }
    public void setStrength(int str)
    {
        this.strength = str;
    }
    public void setRange(int range)
    {
        this.range = range;
    }
    public void setMage(int mage)
    {
        this.mage = mage;
    }
    public int getAttack()
    {
        return attack;
    }
    public int getStrength()
    {
        return strength;
    }
    public int getRange()
    {
        return range;
    }
    public int getMage()
    {
        return mage;
    }
    public int getDef()
    {
        return defense;
    }


    
}
