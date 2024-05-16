package Animals;

public class Horse extends PackAnimals {
    public Horse(String name, String birthdate) {
        super(name, birthdate);
    }

    @Override
    public String getType() {
        return "Horse";
    }
}
