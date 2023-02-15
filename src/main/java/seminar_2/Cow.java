package seminar_2;

public class Cow extends Herbivores implements Runable{
    public Cow(String nickname) {
        super(nickname);
    }

    public String toString(){
        return "I'm cow " + super.toString() + "my speed of run is " + speedOfRun();
    }

    public String say(){
        return "mu-mu";
    }

    @Override
    public int speedOfRun() {
        return 5;
    }
}