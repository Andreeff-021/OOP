package seminar_4;

public class Footman extends BaseHero<Melee, Shield> {

    public Footman(int health, String name, Melee weapon, Shield protection) {
        super(health, name, weapon, protection);
    }

    @Override
    public String toString() {
        return "Footman{" +
                "weapon=" + weapon +
                ", protection=" + protection +
                "} " + super.toString();
    }
}
