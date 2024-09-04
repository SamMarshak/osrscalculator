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

    
}
