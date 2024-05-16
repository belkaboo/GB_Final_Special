package Animals;

public class Cat extends Pets {
    public Cat(String name, String birthdate) {
        super(name, birthdate);
    }

    @Override
    public String getType() {
        return "Cat";
    }
}
