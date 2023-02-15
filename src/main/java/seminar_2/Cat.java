package seminar_2;

public class Cat extends Predator implements Runable{
    public Cat(String nickname) {
        super(nickname);
    }

    public String toString(){
        return "I'm cat " + super.toString() + " my speed of run is " + speedOfRun();
    }

    public String say(){
        return "mayu-mayu";
    }

    @Override
    public int speedOfRun() {
        return 10;
    }
}