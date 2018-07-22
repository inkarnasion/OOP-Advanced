package enumeration_and_anotation_exercises.cardGame;

public class Card {
    private RankPowers rankPowers;
    private SuitPowers suitPowers;
    private int powers;

    public Card(RankPowers rankPowers, SuitPowers suitPowers) {
        this.rankPowers = rankPowers;
        this.suitPowers = suitPowers;
        this.powers=powers;
    }

    public int getPowers() {
        return this.rankPowers.getPower() + this.suitPowers.getPower();
    }

    @Override
    public String toString() {
        return String.format("%s of %s", this.rankPowers.name(), this.suitPowers.name());
    }
}