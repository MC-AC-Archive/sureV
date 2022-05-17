package me.levansj01.verus.check;

import me.levansj01.verus.check.type.*;
import me.levansj01.verus.check.version.*;
import me.levansj01.verus.data.version.*;
import me.levansj01.verus.compat.*;

public abstract class PacketCheck extends Check
{
    public PacketCheck(final CheckType checkType, final String s, final String s2, final CheckVersion checkVersion, final ClientVersion... array) {
        super(checkType, s, s2, checkVersion, array);
    }
    
    public PacketCheck() {
    }
    
    public abstract void handle(final VPacket p0, final long p1);
}
