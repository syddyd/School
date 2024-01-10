public class BoolCard {
    private boolean bit32;
    private boolean bit16;
    private boolean bit8;
    private boolean bit4;
    private boolean bit2;
    private boolean bit1;

    public BoolCard(String suit, int rank) throws Exception {
        int tag;
        if (suit.equals("heart")){
            tag = 1;
        } else if (suit.equals("diamond")){
            tag = 14;
        } else if (suit.equals("club")){
            tag = 27;
        } else if (suit.equals("spade")){
            tag = 40;
        } else
            throw new Exception("no such suit");

        tag +=rank-1;

        bit1 = tag % 2 == 1;
        tag /= 2;

        bit2 = tag % 2 == 1;
        tag /= 2;

        bit4 = tag % 2 == 1;
        tag /= 2;

        bit8 = tag % 2 == 1;
        tag /= 2;

        bit16 = tag % 2 == 1;
        tag /= 2;

        bit32 = tag % 2 == 1;
    }
    private int getTag(){
        int tag = 0;
        if (bit32)
            tag +=32;
        if (bit16)
            tag +=16;
        if (bit8)
            tag +=8;
        if (bit4)
            tag +=4;
        if (bit2)
            tag +=2;
        if (bit1)
            tag +=1;

        return tag;
    }

    public String getSuit() throws Exception{
        int tag = getTag();
        if (tag/13 == 0 || tag == 13) return "heart";
        if (tag/13 == 1 || tag == 26) return "diamond";
        if (tag/13 == 2 || tag == 39) return "club";
        if (tag/13 == 3 || tag == 52) return "spade";
        throw new Exception("tag error");
    }

    public int getRank(){
        int rank = getTag() % 13;
        if (rank == 0)
            rank = 13;
        return rank;
    }
}
