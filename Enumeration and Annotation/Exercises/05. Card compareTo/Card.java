package enumeration_and_anotation_exercises.cardCompareTo;



public class Card <T> implements Comparable<T>{
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
    public int getPowers() {
        this.powers =RankPowers.valueOf(this.rankNames).getPower()+SuitPowers.valueOf(this.suitNames).getPower();
        return this.powers;
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d"
                , rankNames, suitNames, powers);
    }

    @Override
    @SuppressWarnings("unchecked")

    public int compareTo(T o) {
      return Integer.compare(this.getPowers(),o.hashCode());
    }
}