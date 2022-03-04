package kr.bgmsound.onecard;

import kr.bgmsound.onecard.card.Card;
import kr.bgmsound.onecard.card.CardPattern;
import kr.bgmsound.onecard.card.CardType;

import java.util.ArrayList;
import java.util.List;

public class Constant {
    //ICONS : ♠ ♣ ♥ ◆
    public static final String PREFIX = "§8[♠] ";

    //Methods
    public static List<Card> getNewDeck() {
        List<Card> cardList = new ArrayList<>();
        for(CardPattern cardPattern : CardPattern.values()) {
            //String Card
            for(CardType cardType : CardType.values()) {
                if(cardType != CardType.NUMBER && cardType != CardType.JOKER) {
                    cardList.add(new Card(cardType, cardPattern, null));
                }
            }
            //Number Card
            for(int i=2;i<11;i++) {
                cardList.add(new Card(CardType.NUMBER, cardPattern, i));
            }
        }
        //Joker
        cardList.add(new Card(CardType.JOKER, CardPattern.SPADE, null));
        cardList.add(new Card(CardType.JOKER, CardPattern.DIAMOND, null));
        return cardList;
    }
    public static String getCardName(Card card) {
        String cardName;
        String cardPattern = "";
        String cardString = "";
        if(card.getCardType() == CardType.JOKER) {
            if(card.getCardPattern() == CardPattern.SPADE) {
                cardName = "§8흑백 조커";
                return cardName;
            } else {
                cardName = "§c컬러 조커";
                return cardName;
            }
        } else if(card.getCardType() == CardType.ACE) {
            cardString = "A";
        } else if(card.getCardType() == CardType.JACk) {
            cardString = "J";
        } else if(card.getCardType() == CardType.KING) {
            cardString = "K";
        } else if(card.getCardType() == CardType.QUEEN) {
            cardString = "Q";
        } else if(card.getCardType() == CardType.NUMBER) {
            cardString = card.getCardNumber()+"";
        }
        if(card.getCardPattern() == CardPattern.CLOVER) {
            cardPattern = "§8♣";
        } else if(card.getCardPattern() == CardPattern.DIAMOND) {
            cardPattern = "§c◆";
        } else if(card.getCardPattern() == CardPattern.HEART) {
            cardPattern = "§c♥";
        } else if(card.getCardPattern() == CardPattern.SPADE) {
            cardPattern = "§8♠";
        }
        cardName = cardPattern+"§a "+cardString;
        return cardName;
    }
}
