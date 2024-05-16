package Animals;

public class Pets extends Animal {
    public Pets(String name, String birthdate) {
        super(name, birthdate);
    }

    @Override
    public String getType() {
        return "Pets";
    }
}
