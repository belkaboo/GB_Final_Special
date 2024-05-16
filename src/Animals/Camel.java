package Animals;

public class Camel extends PackAnimals{
    public Camel(String name, String birthdate, String commands) {
        super(name, birthdate, commands);
    }

    @Override
    public String getType() {
        return "Camel";
    }
}
