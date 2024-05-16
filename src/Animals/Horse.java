package Animals;

public class Horse extends PackAnimals {
    public Horse(String name, String birthdate, String commands) {
        super(name, birthdate, commands);
    }

    @Override
    public String getType() {
        return "Horse";
    }
}
