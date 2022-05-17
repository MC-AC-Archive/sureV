package me.levansj01.verus.compat;

public class PlayerAbilities
{
    private float flySpeed;
    private boolean fly;
    private float walkSpeed;
    private boolean instantBuild;
    private boolean invulnerable;
    private boolean flying;
    
    public void setFlying(final boolean flying) {
        this.flying = flying;
    }
    
    public float getWalkSpeed() {
        return this.walkSpeed;
    }
    
    public void setFly(final boolean fly) {
        this.fly = fly;
    }
    
    public boolean isFlying() {
        return this.flying;
    }
    
    public boolean isInvulnerable() {
        return this.invulnerable;
    }
    
    public void setFlySpeed(final float flySpeed) {
        this.flySpeed = flySpeed;
    }
    
    public void setWalkSpeed(final float walkSpeed) {
        this.walkSpeed = walkSpeed;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PlayerAbilities)) {
            return false;
        }
        final PlayerAbilities playerAbilities = (PlayerAbilities)o;
        return playerAbilities.canEqual(this) && this.isInvulnerable() == playerAbilities.isInvulnerable() && this.isFlying() == playerAbilities.isFlying() && this.isFly() == playerAbilities.isFly() && this.isInstantBuild() == playerAbilities.isInstantBuild() && Float.compare(this.getWalkSpeed(), playerAbilities.getWalkSpeed()) == 0 && Float.compare(this.getFlySpeed(), playerAbilities.getFlySpeed()) == 0;
    }
    
    public void setInstantBuild(final boolean instantBuild) {
        this.instantBuild = instantBuild;
    }
    
    public boolean isFly() {
        return this.fly;
    }
    
    protected boolean canEqual(final Object o) {
        return o instanceof PlayerAbilities;
    }
    
    public float getFlySpeed() {
        return this.flySpeed;
    }
    
    @Override
    public int hashCode() {
        return (((((1 * 59 + (this.isInvulnerable() ? 79 : 97)) * 59 + (this.isFlying() ? 79 : 97)) * 59 + (this.isFly() ? 79 : 97)) * 59 + (this.isInstantBuild() ? 79 : 97)) * 59 + Float.floatToIntBits(this.getWalkSpeed())) * 59 + Float.floatToIntBits(this.getFlySpeed());
    }
    
    public boolean isInstantBuild() {
        return this.instantBuild;
    }
    
    public PlayerAbilities(final boolean invulnerable, final boolean flying, final boolean fly, final boolean instantBuild, final float walkSpeed, final float flySpeed) {
        this.invulnerable = invulnerable;
        this.flying = flying;
        this.fly = fly;
        this.instantBuild = instantBuild;
        this.walkSpeed = walkSpeed;
        this.flySpeed = flySpeed;
    }
    
    public void setInvulnerable(final boolean invulnerable) {
        this.invulnerable = invulnerable;
    }
}
