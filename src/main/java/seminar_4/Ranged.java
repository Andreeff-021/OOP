package seminar_4;

public class Ranged implements Weapon{
    private String weaponName;
    private int danagePoint;
    private int range;

    public int getRange() {
        return range;
    }

    public Ranged(String weaponName, int danagePoint, int range) {
        this.weaponName = weaponName;
        this.danagePoint = danagePoint;
        this.range = range;
    }

    @Override
    public String toString() {
        return "Ranged{" +
                "weaponName='" + weaponName + '\'' +
                ", danagePoint=" + danagePoint +
                ", range=" + range +
                '}';
    }

    @Override
    public int damage() {
        return danagePoint;
    }
}
