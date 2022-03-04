package kr.bgmsound.onecard.game;

import kr.bgmsound.onecard.OneCard;
import org.bukkit.Bukkit;

import java.util.ArrayList;
import java.util.List;

public class MatchMaker {
    private static List<Channel> channels = new ArrayList<>();
    public static void enable() {
        for(int i=1;i<6;i++) {
            channels.add(new Channel());
        }
        Bukkit.getScheduler().runTaskTimer(OneCard.getInstance(),()-> {
            for(Channel channel : channels) {
                if(channel.getGamePhase() == GamePhase.MATCHMAKING) {
                    channel.spendTime();
                }
            }
        }, 1, 20);
    }
}
