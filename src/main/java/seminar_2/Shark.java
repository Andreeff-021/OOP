package seminar_2;

public class Shark extends Predator implements Swimable{
    public Shark(String nickname) {
        super(nickname);
    }

    @Override
    public String say() {
        return "sharks don't tell";
    }

    @Override
    public int speedOfSwim() {
        return 19;
    }

    public String toString(){
        return "I'm shark " + super.nickname + ". My swiming speed is " + speedOfSwim();
    }
}
