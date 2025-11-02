public class Kata2 {

    public String winner(String[] deckSteve, String[] deckJosh) {
        String[] cardOrder = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};

        int steveScore = 0;
        int joshScore = 0;

        for (int i = 0; i < deckSteve.length; i++) {
            String cardSteve = deckSteve[i];
            String cardJosh = deckJosh[i];

            int valueSteve = getCardValue(cardSteve, cardOrder);
            int valueJosh = getCardValue(cardJosh, cardOrder);

            if (valueSteve > valueJosh) {
                steveScore++;
            } else if (valueJosh > valueSteve) {
                joshScore++;
            }
        }

        if (steveScore > joshScore) {
            return "Steve wins " + steveScore + " to " + joshScore;
        } else if (joshScore > steveScore) {
            return "Josh wins " + joshScore + " to " + steveScore;
        } else {
            return "Tie";
        }
    }

    public int getCardValue(String card, String[] cardOrder) {
        for (int i = 0; i < cardOrder.length; i++) {
            if (card.equals(cardOrder[i])) {
                return i;
            }
        }
        return -1;
    }
}
