package seminar_2;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private Radio radio = new Radio();
    private List<Animal> animals = new ArrayList<>();
    public List<Animal> addAnimal(List<Animal> animals){
        this.animals.addAll(animals);
        return this.animals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Sayable> getSayAble(){
        List<Sayable> result = new ArrayList<>();
        for(Animal item : animals){
            result.add(item);
        }
        result.add(radio);
        return result;
    }

    public List<Runable> getRunable(){
        List<Runable> result = new ArrayList<>();
        for(Animal item : animals){
            if (item instanceof Runable){
                result.add((Runable) item);
            }
        }
        return result;
    }

    public List<Flyable> getFlyable(){
        List<Flyable> result = new ArrayList<>();
        for(Animal item : animals){
            if (item instanceof Flyable){
                result.add((Flyable) item);
            }
        }
        return result;
    }

    public List<Swimable> getSwimable(){
        List<Swimable> result = new ArrayList<>();
        for(Animal item : animals){
            if (item instanceof Swimable){
                result.add((Swimable) item);
            }
        }
        return result;
    }

    public Runable getWinnerRun(){
        List<Runable> runanimals = getRunable();
        Runable winner = runanimals.get(0);
        for (Runable item : runanimals) {
            if (winner.speedOfRun() < item.speedOfRun()){
                winner = item;
            }
        }
        return winner;
    }

    public Flyable getWinnerFly(){
        List<Flyable> flyanimals = getFlyable();
        Flyable winner = flyanimals.get(0);
        for (Flyable item : flyanimals) {
            if (winner.speedOfFly() < item.speedOfFly()){
                winner = item;
            }
        }
        return winner;
    }

    public Swimable getWinnerSwim(){
        List<Swimable> swimAnimals = getSwimable();
        Swimable winner = swimAnimals.get(0);
        for (Swimable item : swimAnimals) {
            if (winner.speedOfSwim() < item.speedOfSwim()){
                winner = item;
            }
        }
        return winner;
    }
}
