package enumeratoin_and_anotation_lab.cofee_machine.enums;

public class Coffee {
    private CoffeeSize size;
    private CoffeeType type;

    public Coffee(CoffeeSize size, CoffeeType type) {
        this.size = size;
        this.type = type;
    }
    public int getPrice(){
       return this.size.getPrice();
    }

    @Override
    public String toString() {
        return  this.size.toString() + " " + this.type.toString();
    }
}
