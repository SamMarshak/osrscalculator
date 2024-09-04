package classes;

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

}
