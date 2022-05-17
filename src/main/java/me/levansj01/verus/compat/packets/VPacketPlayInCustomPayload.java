package me.levansj01.verus.compat.packets;

import me.levansj01.verus.compat.*;

public abstract class VPacketPlayInCustomPayload extends VPacket
{
    protected String channel;
    protected Integer length;
    protected byte[] data;
    
    protected abstract byte[] fetchData();
    
    public Integer getLength() {
        return this.length;
    }
    
    public byte[] getData() {
        if (this.data == null) {
            this.data = this.fetchData();
        }
        return this.data;
    }
    
    public String getChannel() {
        return this.channel;
    }
}
