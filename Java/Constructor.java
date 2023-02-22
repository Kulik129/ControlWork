package Java;

public class Constructor {
    private String animal;
    private String name;
    private String commands;

    public Constructor(String animal, String name, String commands) {
        this.animal = animal;
        this.name = name;
        this.commands = commands;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    @Override
    public String toString() {
        return animal +
                " по имени='" + name + '\'' +
                ", знает команды: ='" + commands + '\'';
    }
}
