package Animals;

public class Camel extends PackAnimals{
    public Camel(String name, String birthdate) {
        super(name, birthdate);
    }

    @Override
    public String getType() {
        return "Camel";
    }
}
