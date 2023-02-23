package seminar_4;

public class Archer extends BaseHero<Ranged>{
    public Archer(int health, String name, Ranged range) {
        super(health, name, range);
    }


    public int range(){
        return weapon.getRange();
    }

    @Override
    public String toString() {
        return "Archer{" +
                "weapon=" + weapon +
                "} " + super.toString();
    }
}
