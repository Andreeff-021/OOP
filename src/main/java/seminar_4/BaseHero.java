package seminar_4;

import java.util.Random;

public abstract class BaseHero<W extends Weapon, P extends Protection> {
    private int health;
    private String name;
    protected W weapon;
    protected P protection;

    protected BaseHero(int health, String name, W weapon, P protection) {
        this.health = health;
        this.name = name;
        this.weapon = weapon;
        this.protection = protection;
    }

//    public int hitLevel(){
//        Random random = new Random();
//        return random.nextInt(weapon.damage());
//    }
//
//    public boolean hit (BaseHero recipient){
//        int damage = hitLevel();
//        return !recipient.reduceHealth(damage);
//    }

    public boolean hit (BaseHero recipient){
        int damage = weapon.damage();
        return !recipient.reduceHealth(damage);
    }

    public boolean reduceHealth(int damage){
        health -= damage - protection.protect();
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

    public P getProtection() {
        return protection;
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
                ", name='" + name +
                '}';
    }
}
