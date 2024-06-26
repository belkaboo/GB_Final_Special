package Animals;

public abstract class Animal {
    private String name;
    private String birthdate;
    private String commands;

    public Animal(String name, String birthdate) {
        this.name = name;
        this.birthdate = birthdate;
        this.commands = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    public void addCommand(String command) {
        if (this.commands.isEmpty()) {
            this.commands = command;
        } else {
            this.commands += ", " + command;
        }
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", commands='" + commands + '\'' +
                '}';
    }


    public abstract String getType();
}

