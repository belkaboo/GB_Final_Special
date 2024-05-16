package Animals;

public class Dog extends Pets{
    public Dog(String name, String birthdate) {
        super(name, birthdate);
    }

    @Override
    public String getType() {
        return "Dog";
    }
}
