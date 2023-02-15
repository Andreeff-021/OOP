package seminar_2;

public class Butterfly extends Herbivores implements Flyable{
    public Butterfly(String nickname) {
        super(nickname);
    }

    @Override
    public String say() {
        return "--------";
    }

    @Override
    public int speedOfFly() {
        return 15;
    }
    public String toString(){
        return "I'm butterfly " + super.toString() + "  my speed of fly is " + speedOfFly();
    }
}
