package me.levansj01.verus.compat;

import org.bukkit.entity.*;

public abstract class FakeEntity
{
    private final int id;
    
    public abstract void setInvisible(final boolean p0);
    
    public abstract void spawn(final Player p0);
    
    public FakeEntity(final int id) {
        this.id = id;
    }
}
