package seminar_2;

public class Duck extends Herbivores implements Flyable, Runable, Sayable{
    public Duck(String nickname) {
        super(nickname);
    }

    @Override
    public int speedOfRun() {
        return 3;
    }

    @Override
    public String say() {
        return "Kray-kray";
    }

    @Override
    public int speedOfFly() {
        return 45;
    }
    public String toString(){
        return "I'm duck " + super.toString() + " my speed of run is " + speedOfRun()
                + " my speed of fly is " + speedOfFly();
    }
}
