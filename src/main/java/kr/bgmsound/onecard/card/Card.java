package kr.bgmsound.onecard.card;

import kr.bgmsound.onecard.Constant;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Card {
    private final CardType cardType;
    private final CardPattern cardPattern;
    private final Integer cardNumber;
    private final ItemStack cardItem;
    public Card(CardType cardType, CardPattern cardPattern, Integer cardNumber) {
        this.cardPattern = cardPattern;
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        ItemStack item = new ItemStack(Material.PAPER);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName(Constant.getCardName(this));
        item.setItemMeta(itemMeta);
        cardItem = item;
    }
    public CardType getCardType() {
        return cardType;
    }
    public CardPattern getCardPattern() {
        return cardPattern;
    }
    public Integer getCardNumber() {
        return cardNumber;
    }
    public ItemStack getCardItem() {
        return cardItem;
    }
}
