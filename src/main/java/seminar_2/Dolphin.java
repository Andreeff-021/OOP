package seminar_2;

public class Dolphin extends Predator implements Swimable{

    public Dolphin(String nickname) {
        super(nickname);
    }

    @Override
    public String say() {
        return "dolphins don't talk";
    }

    @Override
    public int speedOfSwim() {
        return 28;
    }

    public String toString(){
        return "I'm dolphin " + super.nickname + ". My swimming speed is " + speedOfSwim();
    }
}
