package me.levansj01.verus.compat;

public class PacketTransformer extends ThreadLocal
{
    private final Class<?> clazz;
    
    @Override
    protected VPacket initialValue() {
        try {
            return (VPacket)this.clazz.newInstance();
        }
        catch (InstantiationException | IllegalAccessException ex) {
            final Object o;
            throw new UnsupportedOperationException((Throwable)o);
        }
    }
    
    @Override
    protected Object initialValue() {
        return this.initialValue();
    }
    
    public PacketTransformer(final Class clazz) {
        this.clazz = (Class<?>)clazz;
    }
}
