public class Main {
    public static void main(String[] args) throws Exception {
        BoolCard myCard = new BoolCard("diamond", 13);
        System.out.println(myCard.getRank()+" of "+myCard.getSuit()+"s");
    }
}