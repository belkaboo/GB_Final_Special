package Animals;

public class Hamster extends Pets{
    public Hamster(String name, String birthdate) {
        super(name, birthdate);
    }

    @Override
    public String getType() {
        return "Hamster";
    }
}
