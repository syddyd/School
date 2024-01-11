public class Card {
    //this is where i will write my best version of card, encapsulated and with a joker
    public enum suit { SPADES, HEARTS, DIAMONDS, CLUBS, JOKER }
    public enum rank { ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, JOKER }

    private suit cSuit;
    private rank cRank;
    public Card (suit s, rank r){
        if (s == suit.JOKER || r == rank.JOKER){
            cSuit = suit.JOKER;
            cRank = rank.JOKER;
        } else {
            cSuit = s;
            cRank = r;
        }
    }

    public suit getSuit(){
        return cSuit;
    }

    public rank getRank(){
        return cRank;
    }

    public String ToString(){
        if (getSuit() == suit.JOKER)
            return "JOKER";
        return getRank().toString()+" of "+getSuit().toString();
    }
}
