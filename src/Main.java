import java.io.IOException;
import java.util.Scanner;
/*
Формат сдачи: ссылка на подписанный git-проект.

Задание

Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что в во входной структуре будут повторяющиеся имена
с разными телефонами, их необходимо считать, как одного человека с разными телефонами.
 Вывод должен быть отсортирован по убыванию числа телефонов.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        CreatePhoneBook createPhoneBook = new CreatePhoneBook();
        createPhoneBook.CreatePhoneBook();
        boolean isWork = true;
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        System.out.println("Для выхода из программы наберите: Q\nДля начала откройте файл введя: New");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("Q")) System.exit(0);
        else if (input.equalsIgnoreCase("New")) {
            while (isWork) {
                System.out.println("Для выхода из программы наберите: Q\nДля продолжения введите имя");
                if (input.equalsIgnoreCase("Q")) isWork = false;
                else{
                    String name = scanner.nextLine();
                    System.out.print("Введите номер телефона: ");
                    Integer numberPhone = Integer.parseInt(scanner.nextLine());
                    createPhoneBook.fileWriter(name, numberPhone);
                }
                System.out.println("Текущий введенный список");
                phoneBook.PrintMap();
            }
        }
    }
}