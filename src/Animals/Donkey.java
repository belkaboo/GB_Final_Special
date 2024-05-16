package Animals;

public class Donkey extends PackAnimals {
    public Donkey(String name, String birthdate) {
        super(name, birthdate);
    }

    @Override
    public String getType() {
        return "Donkey";
    }
}
