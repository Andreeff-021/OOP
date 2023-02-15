package seminar_2;

public abstract class Herbivores extends Animal{
    public Herbivores(String nickname) {
        super(nickname);
    }

    public String feed(){
        return "eat herb";
    }
}
