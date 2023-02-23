package seminar_4;

public class Main {
    public static void main(String[] args) {
        Team<Footman> squad = new Team<>();
        squad.addWarrior(new Footman(55, "Jor", new Melee(15, "spear")));
        squad.addWarrior(new Footman(55, "Moe", new Melee(10, "sword")));
        squad.addWarrior(new Footman(55, "Doe", new Melee(20, "axe")));

        for (Footman item : squad){
            System.out.println(item);
        }

        System.out.println(squad.getTeamHealth());
        System.out.println(squad.getMaxRange());
        System.out.println(squad.getSumDamage());

        System.out.println("-----------------------------------------------------------");

        Team<BaseHero> mixedTeam = new Team<>();
        mixedTeam.addWarrior(new Archer(15, "John", new Ranged("bow", 5, 50)));
        mixedTeam.addWarrior(new Archer(15, "Carl", new Ranged("crossbow", 15, 25)));
        mixedTeam.addWarrior(new Footman(45, "Earl", new Melee(14, "crosbow")));

        for (BaseHero item : mixedTeam){
            System.out.println(item);
        }

        System.out.println(mixedTeam.getTeamHealth());
        System.out.println(mixedTeam.getMaxRange());
        System.out.println(mixedTeam.getSumDamage());

        System.out.println("-----------------------------------------------------------");

        Footman footman1 = new Footman(56, "Вася", new Melee(30, "spear"));
        Footman footman2 = new Footman(63, "Петя", new Melee(32, "blockhead"));

        while (footman1.getHealth() > 0 && footman2.getHealth() > 0){
            footman1.hit(footman2);
            System.out.println(footman2);
            footman2.hit(footman1);
            System.out.println(footman1);
        }

        if (footman1.getHealth() > 0) System.out.println("Победил " + footman1.getName());
        else System.out.println("Победил " + footman2.getName());
    }
}
