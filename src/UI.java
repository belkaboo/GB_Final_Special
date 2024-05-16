import Animals.Animal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UI {
        private List<Animal> animals = new ArrayList<>();

        public void start() {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("1. Добавить новое животное");
                System.out.println("2. Определить тип животного");
                System.out.println("3. Вывести список команд животного");
                System.out.println("4. Добавить новые команды");
                System.out.println("5. Выход");
                System.out.print("Выберите действие: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        //todo
                        break;
                    case 2:
                        //todo
                        break;
                    case 3:
                        //todo
                        break;
                    case 4:
                        //todo
                        break;
                    case 5:
                        System.out.println("Выход из программы.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Неверный выбор. Попробуйте снова.");
                }
            }
        }
}

