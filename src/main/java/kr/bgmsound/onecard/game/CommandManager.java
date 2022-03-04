package kr.bgmsound.onecard.game;

import kr.bgmsound.onecard.Constant;
import kr.bgmsound.onecard.card.Card;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import java.util.List;

public class CommandManager implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length == 1 && args[0].equals("덱보기")) {
            List<Card> deck = Constant.getNewDeck();
            Inventory inventory = Bukkit.createInventory(null, 54, "카드");
            int i=0;
            for(Card card : deck) {
                inventory.setItem(i++, card.getCardItem());
            }
            Player player = (Player) sender;
            player.openInventory(inventory);
        }
        return false;
    }
}
