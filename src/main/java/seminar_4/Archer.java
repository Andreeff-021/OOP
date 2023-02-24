package seminar_4;

public class Archer extends BaseHero<Ranged, Shield>{
    public Archer(int health, String name, Ranged range, Shield protection) {

        super(health, name, range, protection);
    }


    public int range(){
        return weapon.getRange();
    }

    @Override
    public String toString() {
        return "Archer{" +
                "weapon=" + weapon +
                ", protection=" + protection +
                "} " + super.toString();
    }
}
