package seminar_2;

public abstract class Predator extends Animal{
    public Predator(String nickname) {
        super(nickname);
    }

    public String feed(){
        return "eat meat";
    }
}
