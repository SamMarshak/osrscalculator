package equipment.Armor;

import classes.Armor;
import enums.EquipmentSlot;

public class EmptySlot extends Armor{

    public EmptySlot(EquipmentSlot s)
    {
        super();
        this.slot = s;
    }
}
