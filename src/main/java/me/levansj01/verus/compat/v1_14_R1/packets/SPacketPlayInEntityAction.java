package me.levansj01.verus.compat.v1_14_R1.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_14_R1.*;

public class SPacketPlayInEntityAction extends VPacketPlayInEntityAction
{
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInEntityAction)o);
    }
    
    public void accept(final PacketPlayInEntityAction packetPlayInEntityAction) {
        switch (SPacketPlayInEntityAction$1.$SwitchMap$net$minecraft$server$v1_14_R1$PacketPlayInEntityAction$EnumPlayerAction[packetPlayInEntityAction.c().ordinal()]) {
            case 1: {
                this.action = PlayerAction.START_SNEAKING;
                if (0 >= 1) {
                    return;
                }
                break;
            }
            case 2: {
                this.action = PlayerAction.STOP_SNEAKING;
                if (0 == 4) {
                    return;
                }
                break;
            }
            case 3: {
                this.action = PlayerAction.STOP_SLEEPING;
                if (-4 >= 0) {
                    return;
                }
                break;
            }
            case 4: {
                this.action = PlayerAction.START_SPRINTING;
                if (-1 == 2) {
                    return;
                }
                break;
            }
            case 5: {
                this.action = PlayerAction.STOP_SPRINTING;
                if (-2 > 0) {
                    return;
                }
                break;
            }
            case 6:
            case 7: {
                this.action = PlayerAction.RIDING_JUMP;
                if (0 < -1) {
                    return;
                }
                break;
            }
            case 8: {
                this.action = PlayerAction.OPEN_INVENTORY;
                if (0 < -1) {
                    return;
                }
                break;
            }
            case 9: {
                this.action = PlayerAction.START_FALL_FLYING;
                break;
            }
        }
        this.value = packetPlayInEntityAction.d();
    }
}
