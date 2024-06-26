import Animals.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// ко всем методам добавить проверку на валидность введённых данных
public class Functions {
    private static List<Animal> animals = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void addAnimal() {
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
    public static void printAllAnimals() {
        if (animals.isEmpty()) {
            System.out.println("Животных нет.");
            return;
        }

        for (Animal animal : animals) {
            System.out.println("Имя: " + animal.getName());
            System.out.println("Тип: " + animal.getClass().getSimpleName());
            System.out.println("Дата рождения: " + animal.getBirthdate());
            System.out.println("Команды: " + animal.getCommands());
            System.out.println("--------------------------");
        }
    }

    public static void printCommands() {
        System.out.print("Введите имя животного для просмотра команд: ");
        String name = scanner.nextLine();
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                if (animal.getCommands().isEmpty()) {
                    System.out.println(name + " Животное ещё не обучено");
                } else {
                    System.out.println(name + " знает следующие команды: " + animal.getCommands());
                }
                return;
            }
        }
        System.out.println("Животное не найдено.");
    }

    public static void addCommand() {
        System.out.print("Введите имя животного для обучения: ");
        String name = scanner.nextLine();
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                System.out.print("Введите команду для обучения: ");
                String command = scanner.nextLine();
                animal.addCommand(command);
                System.out.println(name + " обучен новой команде.");
                return;
            }
        }
        System.out.println("Животное не найдено.");
    }
    public static void animalClassification() {
        //todo
    }

}
