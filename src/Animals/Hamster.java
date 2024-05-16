package Animals;

public class Hamster extends Pets{
    public Hamster(String name, String birthdate, String commands) {
        super(name, birthdate, commands);
    }

    @Override
    public String getType() {
        return "Hamster";
    }
}
