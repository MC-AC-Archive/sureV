package me.levansj01.verus.compat.packets;

import me.levansj01.verus.compat.*;

public abstract class VPacketPlayInChat extends VPacket
{
    protected boolean command;
    protected String message;
    
    public String getMessage() {
        return this.message;
    }
    
    public boolean isCommand() {
        return this.command;
    }
}
