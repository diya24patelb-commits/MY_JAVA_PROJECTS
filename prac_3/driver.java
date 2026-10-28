public class driver{
    public static void main(String[] args) {

        card[] cards = {
            new card("Ace", "Spades"),
            new card("Queen", "Hearts"),
            new card("King", "Diamonds"),
            new card("King", "Diamonds"),   // Duplicate
            new card("10", "Clubs")
        };

        boolean duplicateFound = false;

        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < i; j++) {
                if (cards[i].equals(cards[j])) {
                    System.out.println("Duplicate found: " + cards[i]);
                    duplicateFound = true;
                    break;
                }
            }

            if (duplicateFound)
                break;
        }
    }
}
