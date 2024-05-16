package Animals;

public class PackAnimals extends Animal {
    public PackAnimals(String name, String birthdate) {
        super(name, birthdate);
    }

    @Override
    public String getType() {
        return "PackAnimal";
    }
}
