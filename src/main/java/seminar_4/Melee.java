package seminar_4;

public class Melee implements Weapon{
    private int damagePoint;
    String weaponName;

    public Melee(int damagePoint, String weaponName) {
        this.damagePoint = damagePoint;
        this.weaponName = weaponName;
    }

    @Override
    public int damage() {
        return damagePoint;
    }

    @Override
    public String toString() {
        return "Melee{" +
                "damagePoint=" + damagePoint +
                ", weaponName='" + weaponName + '\'' +
                '}';
    }
}
