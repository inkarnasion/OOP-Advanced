package enumeration_and_anotation_exercises.cardToString;

public class Card {
    private String rankNames;
    private String suitNames;
    private int powers;

    public Card(String rankNames, String suitNames) {
        this.rankNames = rankNames;
        this.suitNames=suitNames;
        this.setPowers();
    }
    private int setPowers(){
        this.powers =RankPowers.valueOf(this.rankNames).getPower()+SuitPowers.valueOf(this.suitNames).getPower();
        return this.powers;
    }

      @Override
   public String toString() {
       return String.format("Card name: %s of %s; Card power: %d"
               , rankNames, suitNames, powers);
   }
}

