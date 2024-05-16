package Animals;

public class PackAnimals extends Animal {
    public PackAnimals(String name, String birthdate, String commands) {
        super(name, birthdate, commands);
    }

    @Override
    public String getType() {
        return "PackAnimal";
    }
}
