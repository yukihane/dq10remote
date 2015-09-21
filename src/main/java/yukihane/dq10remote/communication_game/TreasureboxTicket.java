package yukihane.dq10remote.communication_game;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by yuki on 15/08/25.
 */
public class TreasureboxTicket {

    @Getter
    @Setter
    private long treasureboxTicket;

    @Getter
    @Setter
    private long ownerWebpcno;

    @Getter
    @Setter
    private String myNickname;

    @Getter
    @Setter
    private String ownerNickname;

    public TreasureboxTicket(long ticketNo, long webPcNo, String name) {
        this.treasureboxTicket = ticketNo;
        this.ownerWebpcno = webPcNo;
        this.myNickname = name;
        this.ownerNickname = name;
    }
}
