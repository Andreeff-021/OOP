package seminar_2;

public class Rabbit extends Herbivores implements Runable{
    public Rabbit(String nickname) {
        super(nickname);
    }

    public String toString(){
        return "I'm rabbit " + super.toString() + "my speed of run is " + speedOfRun();
    }

    public String say(){
        return "pi-pi";
    }

    @Override
    public int speedOfRun() {
        return 30;
    }
}