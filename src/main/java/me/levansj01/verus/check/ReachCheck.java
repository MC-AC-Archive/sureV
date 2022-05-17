package me.levansj01.verus.check;

import java.util.*;
import me.levansj01.verus.data.reach.*;
import me.levansj01.verus.check.type.*;
import me.levansj01.verus.check.version.*;
import me.levansj01.verus.data.version.*;

public abstract class ReachCheck extends Check
{
    public void handle(final List list, final long n) {
    }
    
    public void handle(final ReachBase reachBase, final long n) {
    }
    
    public ReachCheck() {
    }
    
    public ReachCheck(final CheckType checkType, final String s, final String s2, final CheckVersion checkVersion) {
        super(checkType, s, s2, checkVersion, new ClientVersion[0]);
    }
}
