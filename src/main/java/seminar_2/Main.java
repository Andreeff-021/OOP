package seminar_2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Zoo zoopark = new Zoo();
        zoopark.addAnimal(List.of(new Cat(" Barsik"), new Dog(" Sharik"), new Rabbit(" Whik")
                , new Cow(" Murka"), new Duck(" Donald"), new Butterfly("Maya")
                , new Dolphin("Sailor")
                , new Shark("Ripster")));

        for (Sayable item : zoopark.getSayAble()){
            System.out.println(item.say());
        }

        System.out.println("----------------------");

        for (Runable item : zoopark.getRunable()) System.out.println(item);
        System.out.println("----------------------");

        for (Flyable item : zoopark.getFlyable()) System.out.println(item);
        System.out.println("----------------------");

        for (Swimable item : zoopark.getSwimable()) System.out.println(item);
        System.out.println("----------------------");

        System.out.println(zoopark.getWinnerRun());

        System.out.println("----------------------");

        System.out.println(zoopark.getWinnerFly());

        System.out.println("----------------------");

        System.out.println(zoopark.getWinnerSwim());
    }


}
