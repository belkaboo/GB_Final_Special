package Animals;

public class Donkey extends PackAnimals {
    public Donkey(String name, String birthdate, String commands) {
        super(name, birthdate, commands);
    }

    @Override
    public String getType() {
        return "Donkey";
    }
}
