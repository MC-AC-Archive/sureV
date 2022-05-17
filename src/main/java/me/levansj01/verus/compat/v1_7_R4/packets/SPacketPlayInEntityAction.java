package me.levansj01.verus.compat.v1_7_R4.packets;

import me.levansj01.verus.compat.packets.*;
import net.minecraft.server.v1_7_R4.*;

public class SPacketPlayInEntityAction extends VPacketPlayInEntityAction
{
    public void accept(final PacketPlayInEntityAction packetPlayInEntityAction) {
        switch (packetPlayInEntityAction.d()) {
            case 0: {
                this.action = PlayerAction.OPEN_INVENTORY;
                if (-1 == 0) {
                    return;
                }
                break;
            }
            case 1: {
                this.action = PlayerAction.START_SNEAKING;
                if (3 == -1) {
                    return;
                }
                break;
            }
            case 2: {
                this.action = PlayerAction.STOP_SNEAKING;
                if (4 < 0) {
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
                if (-4 > 0) {
                    return;
                }
                break;
            }
            case 5: {
                this.action = PlayerAction.STOP_SPRINTING;
                if (2 < -1) {
                    return;
                }
                break;
            }
            case 6: {
                this.action = PlayerAction.RIDING_JUMP;
                break;
            }
        }
        this.value = packetPlayInEntityAction.e();
    }
    
    @Override
    public void accept(final Object o) {
        this.accept((PacketPlayInEntityAction)o);
    }
}
