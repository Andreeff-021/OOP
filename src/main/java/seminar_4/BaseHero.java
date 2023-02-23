package seminar_4;

import java.util.Random;

public abstract class BaseHero<W extends Weapon> {
    private int health;
    private String name;
    protected W weapon;

    protected BaseHero(int health, String name, W weapon) {
        this.health = health;
        this.name = name;
        this.weapon = weapon;
    }

    public int damageLevel(){
        Random random = new Random();
        return random.nextInt(weapon.damage());
    }

    public boolean hit (BaseHero recipient){
        int damage = damageLevel();
        return !recipient.reduceHealth(damage);
    }

    public boolean reduceHealth(int damage){
        health -= damage;
        return health > 0;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public W getWeapon() {
        return weapon;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "BaseHero{" +
                "health=" + health +
                ", name='" + name + '\'' +
                ", weapon=" + weapon +
                '}';
    }
}
