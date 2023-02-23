package seminar_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends BaseHero> implements Iterable<T>{
    List<T> dreamTeam = new ArrayList<>();

    public void addWarrior(T warrior){
        dreamTeam.add(warrior);
    }

    @Override
    public Iterator<T> iterator() {
        return dreamTeam.iterator();
    }

    public int getTeamHealth(){
        int teamHealth = 0;
        for (T hero : dreamTeam){
            teamHealth += hero.getHealth();
        }
        return teamHealth;
    }

    public int getMaxRange(){
        int maxRange = 0;
        for (T hero : dreamTeam){
            if(hero instanceof Archer) {
                Archer archer = (Archer)hero;
                if (maxRange < archer.range()) maxRange = archer.range();
            }
        }
        return maxRange;
    }

    public int getSumDamage(){
        int suDamage = 0;
        for (T hero : dreamTeam){
            suDamage += hero.getWeapon().damage();
        }
        return suDamage;
    }
}
