package Animals;

public class Dog extends Pets{
    public Dog(String name, String birthdate, String commands) {
        super(name, birthdate, commands);
    }

    @Override
    public String getType() {
        return "Dog";
    }
}
