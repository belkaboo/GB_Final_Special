import Animals.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Functions {
    private List<Animal> animals = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void addAnimal() {
        System.out.print("Введите тип животного (Dog, Cat, Hamster, Horse, Camel, Donkey): ");
        String type = scanner.nextLine();
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите дату рождения (YYYY-MM-DD): ");
        String birthdate = scanner.nextLine();

        Animal animal;
        switch (type.toLowerCase()) {
            case "dog":
                animal = new Dog(name, birthdate);
                break;
            case "cat":
                animal = new Cat(name, birthdate);
                break;
            case "hamster":
                animal = new Hamster(name, birthdate);
                break;
            case "horse":
                animal = new Horse(name, birthdate);
                break;
            case "camel":
                animal = new Camel(name, birthdate);
                break;
            case "donkey":
                animal = new Donkey(name, birthdate);
                break;
            default:
                System.out.println("Неизвестный тип животного.");
                return;
        }
        animals.add(animal);
        System.out.println("Животное добавлено.");
    }


}
