package kr.bgmsound.onecard.game;

import com.google.common.base.Strings;
import kr.bgmsound.onecard.Constant;
import kr.bgmsound.onecard.card.Card;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class Channel {
    private List<UUID> playerIDList = new ArrayList<>();
    private HashMap<UUID, List<Card>> playerDeckMap = new HashMap<>();
    private List<Card> deck;

    private int lastTime = 40;
    private UUID turnPlayerID;
    private GamePhase gamePhase = GamePhase.WAITING;

    public GamePhase getGamePhase() {
        return gamePhase;
    }

    public void join(UUID uuid) {

    }
    public void quit(UUID uuid) {

    }
    public void gameStart() {
        
    }
    public void spendTime() {
        if(gamePhase != GamePhase.WAITING && lastTime != 0) {
            lastTime -= 1;
            if(lastTime == 0) {
                onPhaseChange();
            }
        } else if(gamePhase == GamePhase.WAITING) {
            if(playerIDList.size() > 1) {
                gamePhase = GamePhase.MATCHMAKING;

            }
        }
    }
    private void onPhaseChange() {

    }
    private void broadcastTitle(String string) {

    }
    private void broadcast(String message) {
        for(UUID uuid : playerIDList) {
            Player player = Bukkit.getPlayer(uuid);
            if(player != null) {
                player.sendMessage(message);
            }
        }
    }
}
