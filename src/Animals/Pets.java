package Animals;

public class Pets extends Animal {
    public Pets(String name, String birthdate, String commands) {
        super(name, birthdate, commands);
    }

    @Override
    public String getType() {
        return "Pets";
    }
}
