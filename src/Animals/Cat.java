package Animals;

public class Cat extends Pets {
    public Cat(String name, String birthdate, String commands) {
        super(name, birthdate, commands);
    }

    @Override
    public String getType() {
        return "Cat";
    }
}
