package enumeratoin_and_anotation_lab.weekdays;

public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;


    @Override
    public String toString() {
        return this.name().charAt(0)+
                this.name().substring(1).toLowerCase();
        /**
         * this сочи към текущата инстанция от която викате стринга.
         */
    }
}
